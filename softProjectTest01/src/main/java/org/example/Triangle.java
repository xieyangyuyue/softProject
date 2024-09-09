package org.example;

public class Triangle {

   public String classify(int a, int b, int c) {
      // 检查边长是否满足条件3
      if (a < 1 || a > 100 || b < 1 || b > 100 || c < 1 || c > 100) {
         return "输入错误";
      }

      // 检查是否满足条件4（构成三角形的必要条件）
      if (!((a + b > c) && (a + c > b) && (b + c > a))) {
         return "非三角形";
      }

      // 检查是否为等边三角形
      if (a == b && b == c) {
         return "等边三角形";
      }

      // 检查是否为等腰三角形
      if (a == b || a == c || b == c) {
         return "等腰三角形";
      }

      // 如果不是以上情况，则为一般三角形
      return "不等边三角形";
   }
}
