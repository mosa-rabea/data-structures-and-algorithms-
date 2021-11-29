/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());

        Graph<String> breadthFirstTest = new Graph<>();
        Node mosa = breadthFirstTest.addNode("mosa");
        Node odeh =  breadthFirstTest.addNode("odeh");
        Node renad = breadthFirstTest.addNode("renad");
        Node thaer = breadthFirstTest.addNode("thaer");

        breadthFirstTest.addEdge(mosa,odeh,true);
        breadthFirstTest.addEdge(odeh,renad,true);
        breadthFirstTest.addEdge(renad,thaer,true);
        breadthFirstTest.addEdge(odeh,thaer,true);

        breadthFirstTest.breadthFirst(mosa);

    }
}
