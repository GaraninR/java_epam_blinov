import com.google.common.collect.Lists;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Hello {

    public static void main(String[] args) {
        // System.out.println("Hello, user!");

        List<String> clArguments = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            clArguments.add(args[i]);
        }

        List<String> reverseView = Lists.reverse(clArguments);

        Iterator<String> crunchifyIterator = reverseView.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }
    }

}