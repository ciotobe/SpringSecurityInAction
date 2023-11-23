shijie@DT2-UBUNTU22LTS:~$ curl -XPOST -H "content-type: application/json" -d "{\"username\":\"danielle\",\"password\":\"12345\"}" http://192.168.3.81:8080/user/add
shijie@DT2-UBUNTU22LTS:~$ curl -XPOST -H "content-type: application/json" -d "{\"username\":\"danielle\",\"password\":\"12345\"}" http://192.168.3.81:8080/user/auth
shijie@DT2-UBUNTU22LTS:~$ curl -XPOST -H "content-type: application/json" -d "{\"username\":\"danielle\",\"code\":\"9853\"}" -v http://192.168.3.81:8080/otp/check
Note: Unnecessary use of -X or --request, POST is already inferred.
*   Trying 192.168.3.81:8080...
* Connected to 192.168.3.81 (192.168.3.81) port 8080 (#0)
> POST /otp/check HTTP/1.1
> Host: 192.168.3.81:8080
> User-Agent: curl/7.81.0
> Accept: */*
> content-type: application/json
> Content-Length: 37
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 200
< X-Content-Type-Options: nosniff
< X-XSS-Protection: 1; mode=block
< Cache-Control: no-cache, no-store, max-age=0, must-revalidate
< Pragma: no-cache
< Expires: 0
< X-Frame-Options: DENY
< Content-Length: 0
< Date: Thu, 23 Nov 2023 03:50:25 GMT
<
* Connection #0 to host 192.168.3.81 left intact
shijie@DT2-UBUNTU22LTS:~$ curl -XPOST -H "content-type: application/json" -d "{\"username\":\"danielle\",\"code\":\"9858\"}" -v http://192.168.3.81:8080/otp/check
Note: Unnecessary use of -X or --request, POST is already inferred.
*   Trying 192.168.3.81:8080...
* Connected to 192.168.3.81 (192.168.3.81) port 8080 (#0)
> POST /otp/check HTTP/1.1
> Host: 192.168.3.81:8080
> User-Agent: curl/7.81.0
> Accept: */*
> content-type: application/json
> Content-Length: 37
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 403
< X-Content-Type-Options: nosniff
< X-XSS-Protection: 1; mode=block
< Cache-Control: no-cache, no-store, max-age=0, must-revalidate
< Pragma: no-cache
< Expires: 0
< X-Frame-Options: DENY
< Content-Length: 0
< Date: Thu, 23 Nov 2023 03:50:54 GMT
<
* Connection #0 to host 192.168.3.81 left intact
shijie@DT2-UBUNTU22LTS:~$