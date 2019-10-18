<ul>
<li><strong>docker pull postgres:lastest</strong></li>
<li><strong>docker run -it --name postgres -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres --expose 5432 -v $HOME/docker_data/volumes/postgresql/:/var/lib/postgresql/ postgres:latest
</strong></li>
<li><strong>Check logs : docker logs name</strong>(find default pwd in)</li>  
 <li><strong>ALTER USER 'root'@'localhost' IDENTIFIED BY 'password';</strong></li>  
  
</ul>


