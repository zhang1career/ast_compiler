package lab.zhang.risk.ast_compiler.service;

import lab.zhang.risk.ast_compiler.Routable;
import lab.zhang.risk.ast_compiler.RoutableContext;
import lab.zhang.risk.ast_compiler.RoutableNode;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author zhangrj
 */
@Data
@NoArgsConstructor
public class RouteService<S, V> {
    private Routable<S, V> router;

    public RoutableContext<S, V> act(RoutableNode<S, V> node, RoutableContext<S, V> context) {
        return router.route(node, context);
    }
}
