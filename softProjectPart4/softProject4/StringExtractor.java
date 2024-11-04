import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExtractor {

    public static void main(String[] args) {
        // 指定源文件路径
        String filePath = "/root/GithubProjects/softProject/softProjectPart4/softProject4/WaterTankMain.java";
        extractStringsFromFile(filePath);
    }

    public static void extractStringsFromFile(String filePath) {
        StringBuilder content = new StringBuilder();

        // 读取文件内容
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // 正则表达式匹配字符串
        String regex = "\"(.*?)(?:\\\\\"|[^\"\\\\])*\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content.toString());

        // 提取并处理字符串
        while (matcher.find()) {
            String matchedString = matcher.group(0); // 获取匹配的完整字符串
            String extractedString = processEscapedString(matchedString); // 处理转义字符
            System.out.println(extractedString);
        }
    }

    private static String processEscapedString(String str) {
        // 去掉开头和结尾的双引号
        str = str.substring(1, str.length() - 1);
        // 处理反斜杠转义
        str = str.replace("\\\"", "\""); // 将转义的双引号替换为普通双引号
        return str;
    }
}
