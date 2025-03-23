package com.msacomponet.chapter05;
import java.io.*;
public class test20 {



        static final int MAX = 1000000;
        static boolean[] isPrime = new boolean[MAX + 1];

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            // 에라토스테네스의 체로 소수 판별
            sieve();

            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                int n = Integer.parseInt(br.readLine());
                int count = 0;

                // 골드바흐 파티션 개수 찾기
                for (int i = 2; i <= n / 2; i++) {
                    if (isPrime[i] && isPrime[n - i]) {
                        count++;
                    }
                }
                sb.append(count).append("\n");
            }

            System.out.print(sb);
            br.close();
        }

        // 에라토스테네스의 체: 소수 판별
        static void sieve() {
            for (int i = 2; i <= MAX; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i * i <= MAX; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= MAX; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
        }
    }


