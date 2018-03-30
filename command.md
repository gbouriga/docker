<p>&nbsp;</p>
<p><a href="https://hub.docker.com/">https://hub.docker.com/</a></p>
<p>&nbsp;</p>
<table>
<tbody>
<tr>
<td width="319">
<p>&nbsp;</p>
</td>
<td width="319">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker version</p>
</td>
<td width="319">
<p>Check installed version</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker info</p>
</td>
<td width="319">
<p>Docker info like number of container, running container, number of images etc</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker ps -a</p>
</td>
<td width="319">
<p>List containers in local host</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker run &lt;image_name&gt;</p>
</td>
<td width="319">
<p>Pull image if not exist, create and run docker container</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker pull&nbsp; &lt;image_name:version&gt;</p>
</td>
<td width="319">
<p>Pull image if not exist (if version not specified pull latest)</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker images</p>
</td>
<td width="319">
<p>List all pulled images in local host (with size, creation date, etc)</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker rmi &lt;image_name:version&gt;</p>
<p>docker rmi &lt;image_id&gt;</p>
</td>
<td width="319">
<p>Remove image from local host</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker start &lt;image_name:version&gt;</p>
<p>docker stop &lt;image_id&gt;</p>
</td>
<td width="319">
<p>Start/stop container with specific image</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker rm &lt;container_name&gt;</p>
</td>
<td width="319">
<p>Delete a container(don&rsquo;t delete the image)</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker run &ndash;d(-it) --name &lt;container_name&gt; -p &lt;port&gt; &lt;image_name:version&gt;&nbsp; &lt;/bin/bash&gt;</p>
<p>&nbsp;</p>
</td>
<td width="319">
<p>Start container with :</p>
<p>-d : detached mode(run in background)</p>
<p>--name : name of container to be created</p>
<p>-p :port to run the container in (if web container)</p>
<p>-it : instead of &ndash;d we open a terminal to be in interactive mode</p>
<p>/bin/bash : run it as bash with &ndash;it mode (interactive mode inside the container)</p>
<p>Ctr +p+q : exit the interactive mode without killing the container</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker stop $(docker ps -aq)</p>
</td>
<td width="319">
<p>Stop all containers on quiet mode</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker rmi $(docker rmi -a)</p>
</td>
<td width="319">
<p>Remove all images in local host</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker swarm init --advertise-addr &lt;primary-idr&gt;:2377 --listen-addr &lt;primary-idr&gt;:2377</p>
</td>
<td width="319">
<p>Start docker swarm(clusturazation) on the ip --advertise-addr(if the machine has multiple ip should choose only one) and the noide listen to --listen-addr usingin the swarm port 2377 for trafic management</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker swarm join-token manager</p>
</td>
<td width="319">
<p>Create a command with a valid token to add new manager to the swarm</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker swarm join-token worker</p>
</td>
<td width="319">
<p>Create a command with a valid token to add new worker to the swarm</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker swarm join --token &lt;token&gt; &lt;primary-addr&gt;:2377 --advertise-addr &lt;new-node-addr&gt;:2377 --listen-addr &lt;new-node-addr&gt;:2377</p>
</td>
<td width="319">
<p>Add new manager or worker(node) to existant swarm(The other nodes in the swarm must be able to access the manager/primary at the IP address)</p>
<p>The manager node can coordiante the&nbsp; cluser swarm not the worker =&gt; worker more to run services and</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker service create --name &lt;service-name&gt; -p &lt;port:port&gt; --replicas &lt;number-of-tasks&gt;&nbsp; &lt;image-name&gt;</p>
</td>
<td width="319">
<p>Create service with n tasks running in each manager linked to the current parent manager</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker service rm &lt;service-name&gt;</p>
</td>
<td width="319">
<p>Remove a service</p>
</td>
</tr>
<tr>
<td width="319">
<p>docker service inspact &nbsp;&lt;service-name&gt;</p>
</td>
<td width="319">
<p>Get the service info (image, ips, network info, etc)</p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
