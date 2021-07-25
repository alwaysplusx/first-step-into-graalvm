import java.io.*;
import java.util.stream.*;

import org.graalvm.polyglot.*;

public class PrettyPrintJSON {

    public static void main(String[] args) throws java.io.IOException {
        InputStreamReader systemReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(systemReader);
        String input = reader.lines().collect(Collectors.joining(System.lineSeparator()));
        System.out.println("input text: " + input);
        try (Context context = Context.create("js")) {
            Value parse = context.eval("js", "JSON.parse");
            Value stringify = context.eval("js", "JSON.stringify");
            Value result = stringify.execute(parse.execute(input), null, 2);
            System.out.println("pretty json: " + result.asString());
        }
    }

    public void parseText() {
        Context context = Context.create("js");
        Value parse = context.eval("js", "JSON.parse");
        Value parsedValue = parse.execute("{\"foo\":\"bar\"}");
        System.out.println(parsedValue.getMember("foo").asString());
    }

    public static void stringifyWithContextParam() {
        Context context = Context.newBuilder()
            .allowAllAccess(true)
            .build();
        context.getBindings("js")
            .putMember("params", new MyParam("wuxin"));
        Value result = context.eval("js", "JSON.stringify(params, null, 2)");
        System.out.println("pretty json: " + result.asString());
    }

    public static class MyParam {

        public String name;

        public MyParam(String name) {
            this.name = name;
        }
    }


}
