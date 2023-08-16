// good
protected void tryWithResourceCopy(String src, String dest) throws IOException {
      String inFilePath = "D:\\foo.txt";
      String outFilePath = "D:\\bar.txt";

      // tryブロックを抜けるときにリソースを解放
      try (FileInputStream in = new FileInputStream(inFilePath);
              FileOutputStream out = new FileOutputStream(outFilePath);) {
          int c;

          // データコピー
          while ((c = in.read()) != -1) {
              out.write(c);
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
