For the final project, I build a backend server for a ebook website. It contains an highly encapsulated interface for users to query book information.

for example, after starting the server, the user want to query if there is any book contains 'mysql':
http://localhost:8880/ebook/list?name=mysql
, it would return back encapsulated response parameters : {"success":true,
"message":null,
"content":[{"id":4,"name":"Learning MySQL: Get a Handle on Your Data","category1Id":null,
            "category2Id":null,"description":"Mysql tutorial for beginners covers all basics",
            "cover":null,"docCount":0,"viewCount":0,"likeCount":0}]}
 

database: mysql RDS on Alibaba Cloud


tech frame: springboot, maven, mybaitis
