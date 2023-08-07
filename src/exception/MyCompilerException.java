package exception;

import parser.ASTree;

public class MyCompilerException extends RuntimeException {
    public MyCompilerException(String m) {
        super(m);
    }

    public MyCompilerException(String m, ASTree t) {
        super(m + " " + t.location());
    }
}
