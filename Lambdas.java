public class Lambdas {
        // Walkable obj = new WalkFast();
        // int result = obj.walk(5);
        // System.out.println("Total effective steps: " + result);

        //or
        // Walkable obj = new Walkable() {
        //     @Override
        //     public int walk(int steps) {
        //         System.out.println("Walking anonymously for " + steps + " steps.");
        //         return steps;
        //     } 
        // };
        public static void main(String[] args) {
            Walkable obj = (steps) -> {
                System.out.println("Walking lambda style for " + steps + " steps.");
                return steps*2;
            };
            int result = obj.walk(10);
            System.out.println("Total effective steps: " + result);
        }
    }

@FunctionalInterface
interface  Walkable {
    int walk(int steps);
}

// class WalkFast implements Walkable {
//     @Override
//     public int walk(int steps) {
//         System.out.println("Walking fast for " + steps + " steps.");
//         return steps * 2; // Walks twice as fast
//     }
// }
