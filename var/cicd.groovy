def gitDownload(repo)
{
  git "https://github.com/YasinMohiddin/${repo}.git"
}
def gitBuild()
{
  sh 'mvn package'
}
def gitDeployment(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/-${context}.war"
}
