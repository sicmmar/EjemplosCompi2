import Gramatica.*;

public class Visitor extends GramaticaBaseVisitor {

    @Override
    public Object visitInicio(GramaticaParser.InicioContext ctx){
        System.out.println(ctx.e().INT());
        return visitChildren(ctx);
    }

    @Override
    public Object visitE(GramaticaParser.EContext ctx){
        System.out.println("ESTOY EN LA EXPRESION");
        return visitChildren(ctx);
    }
}
