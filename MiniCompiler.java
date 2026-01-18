import javax.script.*;

class MiniCompiler {
    public static void main(String[] args) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        System.out.println(engine.eval("10+20*3"));
    }
}
