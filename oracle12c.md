<ul>
<li><strong>Database image pulling :</strong> docker pull store/oracle/database-enterprise:12.2.0.1</li>
<li><strong>Run the container :</strong> docker run -d -it --name ora12-db -p 1521:1521 -p 5500:5500 store/oracle/database-enterprise:12.2.0.1</li>
<li><strong>Connect inside the container :</strong> docker exec -it ora12-db bash -c "source /home/oracle/.bashrc; sqlplus /nolog"</li>
<li><strong>Connect outside the container :</strong></li>
</ul>
<p style="padding-left: 60px;">&gt;sqlplus sys/Oradoc_db1@ORCLCDB as sysdba</p>
<ul>
<li><strong>Check database working in sqlplus</strong></li>
</ul>
<p style="padding-left: 60px;">&gt;sqlplus connect /as sysdbas<br /> &gt;sqlplus select name from v$databse;</p>
<ul>
<li><strong>Custom Configurations :</strong></li>
</ul>
<p style="padding-left: 60px;">&gt;DB_SID : This parameter changes the ORACLE_SID of the database. The default value is set to ORCLCDB.<br /> &gt;DB_PDB : This parameter modifies the name of the PDB. The default value is set to ORCLPDB1.<br /> &gt;DB_MEMORY : This parameter sets the memory requirement for the Oracle server. This value determines the amount of memory to be allocated for SGA and PGA. The default value is set to 2GB.<br /> &gt;DB_DOMAIN : This parameter sets the domain to be used for database server. The default value is localdomain.</p>
<ul>
<li><strong>Start with custom configuration parameters :</strong> docker run -d -it --name ora12-db -P --env-file ora.conf store/oracle/database-enterprise:12.2.0.1</li>
</ul>
