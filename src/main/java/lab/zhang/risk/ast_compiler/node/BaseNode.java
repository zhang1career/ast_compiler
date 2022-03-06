package lab.zhang.risk.ast_compiler.node;

import lab.zhang.risk.ast_compiler.NestableData;
import lab.zhang.risk.ast_compiler.RoutableNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author zhangrj
 */
@Data
public class BaseNode<S, V> implements RoutableNode<S, V> {

    private Map<S, BaseNode<S, V>> children = new HashMap<>();

    private NestableData<S, V> data;


    @Override
    public boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public List<? extends RoutableNode<S, V>> getChildValueList() {
        return new ArrayList<>(children.values());
    }

    @Override
    public void addChild(S key, RoutableNode<S, V> child) {
        children.put(key, (BaseNode<S, V>) child);
    }

    @Override
    public RoutableNode<S, V> getChild(S key) {
        return children.get(key);
    }
}
