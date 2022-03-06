package lab.zhang.risk.ast_compiler.context.parse;

import lab.zhang.risk.ast_compiler.ParsableContext;
import lab.zhang.risk.ast_compiler.RoutableNode;
import lab.zhang.risk.ast_compiler.node.BaseNode;


/**
 * @author zhangrj
 */
abstract public class ParseContext<S, V> implements ParsableContext<S, V> {

    protected RoutableNode<S, V> dummy = new BaseNode<>();


    @Override
    public RoutableNode<S, V> getRootNode() {
        return dummy;
    }
}
