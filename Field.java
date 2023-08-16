// bad
String str;  // 文字列であることしかわからない
String code; // 何のコードかわからない

int a;       // 何を指しているかわからない

File file1;  //連番
File file2;

static final String MSGID_E0001 = "E0001"; // 定数名に値が入っている

private boolean writeFlg = false; // どういう場合にtrue/falseとなるのかが不明瞭
// good
String userName;
String messageCode;

int age;

File userListFile;
File companyListFile;

static final String MSGID_FILE_NOT_FOUND = "E0001";

private boolean writable = false;
