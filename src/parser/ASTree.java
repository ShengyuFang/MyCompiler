package parser;

import java.util.Iterator;

public abstract class ASTree implements Iterable<ASTree> {
    // 返回第i个节点
    public abstract ASTree child(int i);

    public abstract int numChildren();

    public abstract Iterator<ASTree> children();

    public abstract String location();

    public Iterator<ASTree> iterator() {
        return children();
    }
}
