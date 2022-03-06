package lab.zhang.risk.ast_compiler.context.parse;

import lab.zhang.risk.ast_compiler.RoutableNode;
import lab.zhang.risk.ast_compiler.node.BaseNode;


/**
 * @author zhangrj
 */
public class PathParseContext<S, V> extends ParseContext<S, V> {
    @Override
    public RoutableNode<S, V> createNode(RoutableNode<S, V> parentNode, S index) {
        RoutableNode<S, V> curtNode = parentNode.getChild(index);
        if (curtNode == null) {
            curtNode = new BaseNode<>();
            parentNode.addChild(index, curtNode);
        }

        return curtNode;
    }
}
