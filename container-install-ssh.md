<p><strong>Tools install :</strong></p>
<ul>
<li>apt -y install vim</li>
<li>
<pre class="bbcodeblock" dir="ltr">apt-get install less</pre>
</li>
</ul>
<p><strong>&nbsp;start docker&nbsp;container :</strong> docker run -d -it --name&nbsp;&lt;name&gt; -p 32722:22&nbsp;&lt;image&gt;</p>
<p><strong>SSH install :</strong></p>
<ul>
<li>docker exec -it ubuntu /bin/bash</li>
<li>apt-get update</li>
<li>apt-get upgrade</li>
<li>apt-get install openssh-server</li>
<li>vi /etc/ssh/sshd_config
<ul>
<li>internal port can be update on Port 22</li>
<li>max authentication attemps can be update on&nbsp;MaxAuthTries 3</li>
</ul>
</li>
<li>If we need to connect with RSA key
<ul>
<li>mkdir .ssh/; chmod 700 .ssh/; cd .ssh/;</li>
<li>touch authorized_keys; chmod 600 authorized_keys</li>
<li>ssh-keygen -t rsa (chose name file for the key example : my-rsa, chosse passphrase)</li>
<li>cat my-rsa.pub &gt;&gt; authorized_keys</li>
</ul>
</li>
<li>update ssh config :&nbsp;vi /etc/ssh/sshd_config
<ul>
<li>RSAAuthentication yes</li>
<li>PubkeyAuthentication yes</li>
<li>ChallengeResponseAuthentication no</li>
<li>PasswordAuthentication no</li>
<li>UsePAM no</li>
<li>AuthorizedKeysFile&nbsp; &nbsp; &nbsp; /.ssh/authorized_keys</li>
</ul>
</li>
<li>Take the private key from&nbsp;/.ssh/my-rsa</li>
<li><code>Update rights :</code>
<ul>
<li><code>chmod 700 /.ssh</code></li>
<li><code>chmod 600 /.ssh/authorized_key</code></li>
</ul>
</li>
<li>service ssh restart</li>
</ul>
<p>&nbsp;</p>
