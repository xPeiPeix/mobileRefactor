export /data/dockerbuildenv/openjdk8
#Clean up artifacts created by prior builds / Compiles code and packages it into a JAR or WAR
#Skip the execution of tests during the build process / Use a path to a custom toolchains file
mvn clean package -DskipTests --toolchains ./toolchains_csm_ccis.xml
