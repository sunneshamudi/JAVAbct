The Main class is dependent upon an external library which is found inside the jars folder.

- To compile, please run the command
javac -d build -cp ./jars/*.jar Main.java

- To run, please run the command
java -cp ./build:./jars/json-simple-1.1.jar Main

