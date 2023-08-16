// bad
boolean isPrimeNumber(int num) {
    boolean ret;
    if (num < 2) {
        ret = false; // 2未満は素数でない
    } else if (num == 2) {
        ret = true;  // 2は素数
    } else if (num % 2 == 0) {
        ret = false; // 2以外の偶数は素数でない
    } else {
        ret = true; // 割り切れなかったら素数
        double sqrtNum = Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i+=2) {
            if (num % i == 0) {
                ret = false;   // 割り切れたら素数でない
                break;
            }
        }
    }
    return ret; 
}
// good
boolean isPrimeNumber(int num) {
    if (num < 2) {
        return false; // 2未満は素数でない
    }
    if (num == 2) {
        return true;  // 2は素数
    }
    if (num % 2 == 0) {
        return false; // 2以外の偶数は素数でない
    }
    double sqrtNum = Math.sqrt(num);
    for (int i = 3; i <= sqrtNum; i+=2) {
        if(num % i == 0) {
            return false;   // 割り切れたら素数でない
        }
    }
    return true; // 割り切れなかったら素数
}
