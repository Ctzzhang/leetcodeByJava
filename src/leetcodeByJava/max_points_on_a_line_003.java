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
		int ret = 0;// �?大的个数
		int len = points.length;
		if (len < 2)
			return len; // 个数少于2，返回个�?

		// 对于第i个点
		// 有垂直的个数
		// 垂直的判断条件就是两个x相同
		// 倾斜角度相同的个�?
		for (int i = 0; i < len; i++) {
			int dup = 1, vti = 0;
			Map<Float, Integer> map = new HashMap<Float, Integer>();// 存放相同斜率的个�?
			Point a = points[i];

			for (int j = 0; j < len; j++) {
				if (i == j)
					continue;
				Point b = points[j];
				if (a.x == b.x) {
					if (a.y == b.y)
						dup++;// 重合的个�?
					else
						vti++;// 垂直的个�?
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
