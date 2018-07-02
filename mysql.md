<ul>
<li><strong>docker pull mysql/mysql-server:tag</strong></li>
<li><strong>docker run -d -it --name name -p 3306:3306 -p 33060:33060 -expose 3306 mysql/mysql-server:tag</strong></li>
<li><strong>Check logs : docker logs name</strong>(find default pwd in)</li>  
 <li><strong>ALTER USER 'root'@'localhost' IDENTIFIED BY 'password';</strong></li>  
  
   <li>if 127.0.0.1 is not working when conntecting outiside the container use the gateway ip address like 127.17.0.1 instead</li>  
</ul>


