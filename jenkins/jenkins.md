<ul>
<li><strong>Run jenkins on docker :</strong>&nbsp;docker run -it -u root --name jenkins -p 8089:8080 -p 50000:50000 --expose 8089 -v /var/jenkins_home:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock jenkins/jenkins:lts</li>
</ul>
