package lab.zhang.risk.ast_compiler.parser;

import lab.zhang.risk.ast_compiler.NestableData;
import lab.zhang.risk.ast_compiler.Parsable;
import lab.zhang.risk.ast_compiler.ParsableContext;
import lab.zhang.risk.ast_compiler.RoutableNode;

import java.util.List;


/**
 * @author zhangrj
 */
abstract public class BaseParser<S, V> implements Parsable<S, V> {

    protected void doParse(List<S> stepList, NestableData<S, V> data, ParsableContext<S, V> context) {
        RoutableNode<S, V> prevNode = context.getRootNode();
        RoutableNode<S, V> curtNode = prevNode;

        for (S step : stepList) {
            curtNode = context.createNode(prevNode, step);
            prevNode = curtNode;
        }

        data.setStep(stepList.get(stepList.size() - 1));
        curtNode.setData(data);
    }
}
