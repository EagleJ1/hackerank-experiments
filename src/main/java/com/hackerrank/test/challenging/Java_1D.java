package com.hackerrank.test.challenging;

import java.util.*;

/**
 * Created by jackalhan on 2/8/17.
 */
public class Java_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Game g = new Game(n, m, arr);
            System.out.println(g.getCanWin() ? "YES" : "NO");
        }}
    //
    private static class Game {
        private int size;
        private int jump;
        private int[] arr;
        private boolean canWin;

        public Game(int n, int m, int[] arr) {
            size = n;
            jump = m;
            this.arr = arr;
            setCanWin();
        }

        private void setCanWin() {
            Deque<int[]> q = new LinkedList<>();
            Set<Integer> s = new HashSet<>();
            q.add(new int[] {0, 0});
            while (!q.isEmpty()) {
                int[] h = q.remove();
                if (s.contains(h[0])) {
                    continue;
                }

                //jump path
                int np;
                if (jump > 1) {
                    np = h[0] + jump;
                    if (np >= size) {
                        canWin = true;
                        break;
                    }
                    if (arr[np] == 0) {
                        q.addFirst(new int[] {np, h[0]});
                        s.add(h[0]);
                    }
                }
                //forward path
                np = h[0] + 1;
                if (np == size) {
                    canWin = true;
                    break;
                }
                if (np != h[1] && arr[np] == 0) {
                    q.add(new int[] {np, h[0]});
                    s.add(h[0]);
                }

                //backward path
                np = h[0] - 1;
                if (np > 0 && arr[np] == 0) {
                    q.add(new int[] {np, h[0]});
                    s.add(h[0]);
                }
            }
        }

        public boolean getCanWin() {
            return canWin;
        }
    }
}
