shijie@DT2-UBUNTU22LTS:~$ curl -v -H "username:danielle" -H "password:12345" http://192.168.3.81:9090/login
*   Trying 192.168.3.81:9090...
* Connected to 192.168.3.81 (192.168.3.81) port 9090 (#0)
> GET /login HTTP/1.1
> Host: 192.168.3.81:9090
> User-Agent: curl/7.81.0
> Accept: */*
> username:danielle
> password:12345
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
< Date: Fri, 24 Nov 2023 04:56:02 GMT
<
* Connection #0 to host 192.168.3.81 left intact
shijie@DT2-UBUNTU22LTS:~$ curl -v -H "username:danielle" -H "code:2930" http://192.168.3.81:9090/login
*   Trying 192.168.3.81:9090...
* Connected to 192.168.3.81 (192.168.3.81) port 9090 (#0)
> GET /login HTTP/1.1
> Host: 192.168.3.81:9090
> User-Agent: curl/7.81.0
> Accept: */*
> username:danielle
> code:2930
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 200
< Authorization: eyJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6ImRhbmllbGxlIn0.umxQ98tgEq8GKa7J2njjF7RMNtlWjIDfmwHQtAHGFmc
< X-Content-Type-Options: nosniff
< X-XSS-Protection: 1; mode=block
< Cache-Control: no-cache, no-store, max-age=0, must-revalidate
< Pragma: no-cache
< Expires: 0
< X-Frame-Options: DENY
< Content-Length: 0
< Date: Fri, 24 Nov 2023 04:58:30 GMT
<
* Connection #0 to host 192.168.3.81 left intact
shijie@DT2-UBUNTU22LTS:~$ curl -v -H "Authorization: eyJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6ImRhbmllbGxlIn0.umxQ98tgEq8GKa7J2njjF7RMNtlWjIDfmwHQtAHGFmc" http://192.168.3.81:9090/test
*   Trying 192.168.3.81:9090...
* Connected to 192.168.3.81 (192.168.3.81) port 9090 (#0)
> GET /test HTTP/1.1
> Host: 192.168.3.81:9090
> User-Agent: curl/7.81.0
> Accept: */*
> Authorization: eyJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6ImRhbmllbGxlIn0.umxQ98tgEq8GKa7J2njjF7RMNtlWjIDfmwHQtAHGFmc
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 200
< Set-Cookie: JSESSIONID=CE121DA99A2E7890A0DD46A58C674B16; Path=/; HttpOnly
< X-Content-Type-Options: nosniff
< X-XSS-Protection: 1; mode=block
< Cache-Control: no-cache, no-store, max-age=0, must-revalidate
< Pragma: no-cache
< Expires: 0
< X-Frame-Options: DENY
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 4
< Date: Fri, 24 Nov 2023 04:59:36 GMT
<
* Connection #0 to host 192.168.3.81 left intact
Testshijie@DT2-UBUNTU22LTS:~$