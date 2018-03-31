Tools install :

apt -y install vim
apt-get install less
 start docker container : docker run -d -it --name <name> -p 32722:22 <image>

SSH install :

docker exec -it ubuntu /bin/bash
apt-get update
apt-get upgrade
apt-get install openssh-server
vi /etc/ssh/sshd_config
internal port can be update on Port 22
max authentication attemps can be update on MaxAuthTries 3
If we need to connect with RSA key
mkdir .ssh/; chmod 700 .ssh/; cd .ssh/;
touch authorized_keys; chmod 600 authorized_keys
ssh-keygen -t rsa (chose name file for the key example : my-rsa, chosse passphrase)
cat my-rsa.pub >> authorized_keys
update ssh config : vi /etc/ssh/sshd_config
RSAAuthentication yes
PubkeyAuthentication yes
ChallengeResponseAuthentication no
PasswordAuthentication no
UsePAM no
AuthorizedKeysFile      /.ssh/authorized_keys
Take the private key from /.ssh/my-rsa
Update rights :
chmod 700 /.ssh
chmod 600 /.ssh/authorized_key
service ssh restart
