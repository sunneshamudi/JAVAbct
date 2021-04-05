The Main class is dependent upon an external library which is found inside the jars folder.

- To compile, please run the command
javac -d build -cp ./jars/commons-collections4-4.4.jar:./jars/poi-5.0.0.jar:./jars/poi-ooxml-5.0.0.jar:./jars/poi-ooxml-full-5.0.0.jar Main.java 

- To run, please run the command
java -cp ./build:./jars/commons-collections4-4.4.jar:./jars/poi-5.0.0.jar:./jars/poi-ooxml-5.0.0.jar:./jars/xmlbeans-4.0.0.jar:./jars/commons-compress-1.20.jar:./jars/poi-ooxml-full-5.0.0.jar Main
n

