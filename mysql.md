<ul>
<li><strong>docker pull mysql/mysql-server:tag</li>
<li><strong>docker run -d -it --name name -p 3306:3306 -p 33060:33060 -expose 3306 mysql/mysql-server:tag</li>
<li><strong>Check logs : docker logs name</strong>(find default pwd in)</li>  
 <li><strong>ALTER USER 'root'@'localhost' IDENTIFIED BY 'password';</li>  
</ul>


