package leetcodeByJava;
import java.util.HashMap;
import java.util.Map;

/*
	Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
	*/
public class max_points_on_a_line_003 {

	class Point {
		int x;
		int y;

		Point() {
			x = 0;
			y = 0;
		}

		Point(int a, int b) {
			x = a;
			y = b;
		}
	}

	public int maxPoints(Point[] points) {
		int ret = 0;// æ?å¤§çä¸ªæ°
		int len = points.length;
		if (len < 2)
			return len; // ä¸ªæ°å°äº2ï¼è¿åä¸ªæ?

		// å¯¹äºç¬¬iä¸ªç¹
		// æåç´çä¸ªæ°
		// åç´çå¤æ­æ¡ä»¶å°±æ¯ä¸¤ä¸ªxç¸å
		// å¾æè§åº¦ç¸åçä¸ªæ?
		for (int i = 0; i < len; i++) {
			int dup = 1, vti = 0;
			Map<Float, Integer> map = new HashMap<Float, Integer>();// å­æ¾ç¸åæççä¸ªæ?
			Point a = points[i];

			for (int j = 0; j < len; j++) {
				if (i == j)
					continue;
				Point b = points[j];
				if (a.x == b.x) {
					if (a.y == b.y)
						dup++;// éåçä¸ªæ?
					else
						vti++;// åç´çä¸ªæ?
				} else {
					float k = (float) (a.y - b.y) / (float) (a.x - b.x);
					if (map.get(k) == null)
						map.put(k, 1);
					else
						map.put(k, map.get(k) + 1);
				}
			}

			int max = vti;
			for (float k : map.keySet()) {
				max = Math.max(max, map.get(k));
			}
			ret = Math.max(max + dup, ret);
		}
		return ret;
	}

}
