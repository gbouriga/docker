<ul>
<li><strong>Run jenkins on docker :</strong>&nbsp;docker run -d -it&nbsp; -u root --name jenkins -p 8089:8089 -p 50000:50000 -expose 8089 -v jenkins-data:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock jenkins</li>
</ul>
