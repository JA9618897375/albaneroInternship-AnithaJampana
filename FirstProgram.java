package intern;
        import java.util.ArrayList;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;

		public class FirstProgram {

			public static List<String> findAndReplacePattern(String[] words, String pattern) {
				List<String> ans = new ArrayList();
				for (String word : words)
					if (match(word, pattern))
						ans.add(word);
				return ans;
			}

			public static boolean match(String word, String pattern) {
				Map<Character, Character> m1 = new HashMap();
				Map<Character, Character> m2 = new HashMap();

				for (int i = 0; i < word.length(); ++i) {
					char w = word.charAt(i);
					char p = pattern.charAt(i);
					if (!m1.containsKey(w))
						m1.put(w, p);
					if (!m2.containsKey(p))
						m2.put(p, w);
					if (m1.get(w) != p || m2.get(p) != w)
						return false;
				}

				return true;
			}

			public static void main(String[] args) {
				String[] strArray = { "abc", "deq", "mee", "aqq", "dkd", "ccc" };
				List<String> ans = findAndReplacePattern(strArray, "abb");
				System.out.println(ans);

			}

		}
	

