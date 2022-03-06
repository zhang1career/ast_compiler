package lab.zhang.risk.ast_compiler.annotation.api_audit.service;

import lab.zhang.risk.ast_compiler.*;
import lab.zhang.risk.ast_compiler.annotation.api_audit.entity.ApiField;
import lab.zhang.risk.ast_compiler.annotation.api_audit.enums.FieldTypeEnum;
import lab.zhang.risk.ast_compiler.annotation.api_audit.nest.ApiFieldNest;
import lab.zhang.risk.ast_compiler.context.parse.PathParseContext;
import lab.zhang.risk.ast_compiler.context.route.NestRouteContext;
import lab.zhang.risk.ast_compiler.lexer.PathLexer;
import lab.zhang.risk.ast_compiler.parser.PathParser;
import lab.zhang.risk.ast_compiler.router.NestRouter;
import lab.zhang.risk.ast_compiler.service.ParseService;
import lab.zhang.risk.ast_compiler.service.RouteService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ParseServiceTest {
    private PathLexer<ApiField> apiFieldPathLexer;
    private ParseService<String, ApiField> apiFieldParseService;
    private RouteService<String, ApiField> apiFieldRouteService;

    @Before
    public void setUp() {
        apiFieldPathLexer = new PathLexer<>();

        apiFieldParseService = new ParseService<>();
        apiFieldParseService.setParser(new PathParser<>());

        apiFieldRouteService = new RouteService<>();
        apiFieldRouteService.setRouter(new NestRouter<>());
    }


    @Test
    public void test_parse_route() {
        NestableData<String, ApiField> token_t = apiFieldPathLexer.lex("teacher", ApiField.of("teacher", "教师", FieldTypeEnum.OBJECT, null));
        NestableData<String, ApiField> token_t_n = apiFieldPathLexer.lex("teacher.name", ApiField.of("name", "姓名", FieldTypeEnum.STRING, null));
        List<NestableData<String, ApiField>> tokenList = new ArrayList<>();
        tokenList.add(token_t);
        tokenList.add(token_t_n);

        ParsableContext<String, ApiField> parsableContext = apiFieldParseService.act(tokenList, new PathParseContext<>());
        System.out.println(parsableContext);

        RoutableContext<String, ApiField> routableContext = apiFieldRouteService.act(parsableContext.getRootNode(), new NestRouteContext<>());
        System.out.println(routableContext);
    }
}
