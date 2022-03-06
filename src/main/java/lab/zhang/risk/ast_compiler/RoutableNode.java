package lab.zhang.risk.ast_compiler;

import java.util.List;


/**
 * @author zhangrj
 */
public interface RoutableNode<S, V> {

    boolean isLeaf();

    List<? extends RoutableNode<S, V>> getChildValueList();

    void addChild(S key, RoutableNode<S, V> child);

    RoutableNode<S, V> getChild(S key);

    void setData(NestableData<S, V> data);

    NestableData<S, V> getData();
}
