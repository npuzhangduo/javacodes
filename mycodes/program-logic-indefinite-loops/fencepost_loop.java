//"loop-and-a-half" solution
//place a post.
//	for (length of fence - 1) {
//	    place some wire.
//	    place a post.
//	}
//
public class fencepost_loop {
    public static void main(String[] args) {
        System.out.print(1);
        for(int i = 2;i <= 10;i++) {
            System.out.print(", " + i);
        }
        System.out.println();
    }
}