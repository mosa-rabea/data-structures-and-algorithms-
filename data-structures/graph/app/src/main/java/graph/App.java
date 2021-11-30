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

//        Graph<String> breadthFirstTest = new Graph<>();
//        Node mosa = breadthFirstTest.addNode("mosa");
//        Node odeh =  breadthFirstTest.addNode("odeh");
//        Node renad = breadthFirstTest.addNode("renad");
//        Node thaer = breadthFirstTest.addNode("thaer");
//
//        breadthFirstTest.addEdge(mosa,odeh,true);
//        breadthFirstTest.addEdge(odeh,renad,true);
//        breadthFirstTest.addEdge(renad,thaer,true);
//        breadthFirstTest.addEdge(odeh,thaer,true);
//
//        breadthFirstTest.breadthFirst(mosa);

        Graph<String> graphDepthFirst = new Graph<>();

        Node mosa = graphDepthFirst.addNode("mosa");
        Node renad =  graphDepthFirst.addNode("renad");
        Node odeh = graphDepthFirst.addNode("odeh");
        Node thaer = graphDepthFirst.addNode("thaer");
        Node malik = graphDepthFirst.addNode("malik");
        Node jameel = graphDepthFirst.addNode("jameel");
        Node reema = graphDepthFirst.addNode("reema");
        Node mahmood = graphDepthFirst.addNode("mahmood");


        graphDepthFirst.addEdge(mosa,renad,true);
        graphDepthFirst.addEdge(mosa,thaer,true);
        graphDepthFirst.addEdge(renad,odeh,true);
        graphDepthFirst.addEdge(renad,thaer,true);
        graphDepthFirst.addEdge(odeh,reema,true);
        graphDepthFirst.addEdge(thaer,malik,true);
        graphDepthFirst.addEdge(thaer,mahmood,true);
        graphDepthFirst.addEdge(thaer,jameel,true);
        graphDepthFirst.addEdge(mahmood,jameel,true);





        graphDepthFirst.depthFirst(mosa);



    }
}
