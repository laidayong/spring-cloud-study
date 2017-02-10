import urllib.request, urllib.parse, urllib.error
import socket
import employee_pb2

if __name__ == '__main__':
	employee = employee_pb2.Employee()
	employee_read = urllib.request.urlopen('http://localhost:8020/getEmployee').read()
	employee.ParseFromString(employee_read)
	print(employee)
	
	try:
		details = employee.SerializeToString()
		url = urllib.request.Request('http://localhost:8020/createEmployee', details)
		url.add_header("User-Agent","Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US) AppleWebKit/525.13 (KHTML, like Gecko) Chrome/0.2.149.29 Safari/525.13")
		url.add_header("Content-Type", "application/x-protobuf")
		responseData = urllib.request.urlopen(url).read().decode('utf8', 'ignore')
		responseFail = False

	except urllib.error.HTTPError as e:
		responseData = e.read().decode('utf8', 'ignore')
		responseFail = False

	except urllib.error.URLError:
		responseFail = True

	except socket.error:
		responseFail = True

	except socket.timeout:
		responseFail = True

	except UnicodeEncodeError:
		print("[x]  Encoding Error")
		responseFail = True

	print(responseData)	