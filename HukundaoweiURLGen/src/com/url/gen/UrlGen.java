package com.url.gen;

public class UrlGen {

	public static void main(String[] args) {

		// String baseUrl =
		// "http://lz.newssc.org/csjr/system/more/0012006000000/0012006000000_[change][page].shtml";

		/*
		 * int start = 19;
		 * 
		 * int startTemp = 0;
		 * 
		 * int endTemp = 7;
		 * 
		 * int end = 21;
		 */
		// [change][page]
		String baseUrl = "http://www.yjnet.cn/system/count//0013001/008000000000/000/000/c0013001008000000000_[change][page].shtml";

		int start = 37;

		int startTemp = 7;

		int end = 123;

		int endTemp = 8;

		boolean isStripZeroPrefix = false;// 是否去掉前缀零

		boolean isMove = true;// 是否存在多个联动

		int moveSize = 3;

		int quyu = 2;

		int bitTotal = 9;// 总的位数，isStripZeroPrefix为false时才有效

		urlGen_2(baseUrl, start, startTemp, endTemp, end, isStripZeroPrefix, bitTotal, isMove, moveSize, quyu);

	}

	/**
	 * example start: String baseUrl =
	 * "http://lz.newssc.org/zfzx/system/more/0012012000000/0012012000000_[page].shtml";
	 * 
	 * int start = 89;
	 * 
	 * int end = 287;
	 * 
	 * example end
	 * 
	 * @param baseUrl
	 * @param start
	 * @param end
	 */
	@SuppressWarnings("unused")
	private static void urlGen_1(String baseUrl, int start, int end) {

		/*
		 * String baseUrl =
		 * "http://lz.newssc.org/zfzx/system/more/0012012000000/0012012000000_[page].shtml";
		 * 
		 * int start = 89;
		 * 
		 * int end = 287;
		 */

		StringBuilder sb = new StringBuilder();

		for (int i = start; i <= end; i++) {
			String str = baseUrl.replaceAll("\\[page\\]", String.valueOf(i));
			sb.append(str + ",\n");

		}

		sb.deleteCharAt(sb.length() - 2);
		System.out.println(sb);

	}

	/**
	 * 
	 * String baseUrl =
	 * "http://lz.newssc.org/csjr/system/more/0012006000000/0012006000000_[change][page].shtml";
	 * 
	 * int start = 19;
	 * 
	 * int startTemp = 0;
	 * 
	 * int endTemp = 7;
	 * 
	 * int end = 21;
	 * 
	 * @param baseUrl
	 * @param start
	 * @param startTemp
	 * @param endTemp
	 * @param end
	 * @param stripZeroPrefix
	 * @param fillZero
	 * @param isMove
	 * @param moveSize
	 */
	private static void urlGen_2(String baseUrl, int start, int startTemp, int endTemp, int end,
			boolean stripZeroPrefix, int fillZero, boolean isMove, int moveSize, int quyu) {
		
		int count = 0;

		if (start < 0 || startTemp < 0 || end < 0 || endTemp < 0 || fillZero < 1 || (start == 0 && startTemp == 0)
				|| (end == 0 && endTemp == 0) || ((start * 10 + startTemp) > (end * 10 + endTemp)) || startTemp > 9
				|| endTemp > 9) {

			throw new RuntimeException("无效的参数设置");

		}

		fillZero -= 1;

		StringBuilder sb = new StringBuilder();
		String zeroNull = String.valueOf(start);

		if (0 == start) {
			zeroNull = "";

		}

		if (start != end) {
			if (startTemp != 1 && startTemp != 0) {
				String str = null;
				for (int i = startTemp; i <= 9; i++) {
					if (isMove) {
						str = baseUrl.replaceAll("\\[page\\]", String.valueOf(i))
								.replaceAll("\\[change\\]",
										String.valueOf(addZero(zeroNull, fillZero, stripZeroPrefix)))
								.replaceAll("\\[move\\]", addMove(zeroNull, moveSize, quyu));

					} else {
						str = baseUrl.replaceAll("\\[page\\]", String.valueOf(i)).replaceAll("\\[change\\]",
								String.valueOf(addZero(zeroNull, fillZero, stripZeroPrefix)));
					}
					sb.append(str + ",\n");
					count++;
				}

			} else if (1 == startTemp) {
				String str = "";
				if (isMove) {
					str = baseUrl
							.replaceAll("\\[change\\]", String.valueOf(addZero(zeroNull, fillZero, stripZeroPrefix)))
							.replaceAll("\\[move\\]", addMove(zeroNull, moveSize, quyu));

				} else {

					str = baseUrl.replaceAll("\\[change\\]",
							String.valueOf(addZero(zeroNull, fillZero, stripZeroPrefix)));

				}
				sb.append(str + "{9},\n");
				count++;
			} else {
				String str = "";
				if (isMove) {
					String haha = baseUrl.replaceAll("\\[page\\]", String.valueOf(0))
							.replaceAll("\\[change\\]", String.valueOf(addZero(zeroNull, fillZero, stripZeroPrefix)))
							.replaceAll("\\[move\\]", addMove(zeroNull, moveSize, quyu));
					sb.append(haha + ",\n");
					count++;
					str = baseUrl
							.replaceAll("\\[change\\]", String.valueOf(addZero(zeroNull, fillZero, stripZeroPrefix)))
							.replaceAll("\\[move\\]", addMove(zeroNull, moveSize, quyu));

				} else {

					String haha = baseUrl.replaceAll("\\[page\\]", String.valueOf(0)).replaceAll("\\[change\\]",
							String.valueOf(addZero(zeroNull, fillZero, stripZeroPrefix)));
					sb.append(haha + ",\n");
					count++;
					str = baseUrl.replaceAll("\\[change\\]",
							String.valueOf(addZero(zeroNull, fillZero, stripZeroPrefix)));

				}
				sb.append(str + "{9},\n");
				count++;

			}

			for (int i = start + 1; i <= end; i++) {
				if (i != end) {
					String str = "";
					if (isMove) {
						String eofIsZero = baseUrl.replaceAll("\\[page\\]", String.valueOf(0))
								.replaceAll("\\[change\\]", String.valueOf(addZero(i, fillZero, stripZeroPrefix)))
								.replaceAll("\\[move\\]", addMove(i, moveSize, quyu));
						sb.append(eofIsZero + ",\n");
						count++;
						str = baseUrl.replaceAll("\\[change\\]", String.valueOf(addZero(i, fillZero, stripZeroPrefix)))
								.replaceAll("\\[move\\]", addMove(i, moveSize, quyu));

					} else {

						String eofIsZero = baseUrl.replaceAll("\\[page\\]", String.valueOf(0))
								.replaceAll("\\[change\\]", String.valueOf(addZero(i, fillZero, stripZeroPrefix)));
						sb.append(eofIsZero + ",\n");
						count++;
						str = baseUrl.replaceAll("\\[change\\]", String.valueOf(addZero(i, fillZero, stripZeroPrefix)));

					}
					sb.append(str + "{9},\n");
					count++;

				} else if (i == end) {

					if (isMove) {
						String eofIsZero = baseUrl.replaceAll("\\[page\\]", String.valueOf(0))
								.replaceAll("\\[change\\]", String.valueOf(addZero(end, fillZero, stripZeroPrefix)))
								.replaceAll("\\[move\\]", addMove(end, moveSize, quyu));
						sb.append(eofIsZero + ",\n");
						count++;
						if (endTemp != 0) {

							String str = baseUrl
									.replaceAll("\\[change\\]", String.valueOf(addZero(end, fillZero, stripZeroPrefix)))
									.replaceAll("\\[move\\]", addMove(end, moveSize, quyu));
							sb.append(str + "{" + endTemp + "},\n");
							count++;
						}

					} else {

						String eofIsZero = baseUrl.replaceAll("\\[page\\]", String.valueOf(0))
								.replaceAll("\\[change\\]", String.valueOf(addZero(end, fillZero, stripZeroPrefix)));
						sb.append(eofIsZero + ",\n");
						count++;
						if (endTemp != 0) {

							String str = baseUrl.replaceAll("\\[change\\]",
									String.valueOf(addZero(end, fillZero, stripZeroPrefix)));
							sb.append(str + "{" + endTemp + "},\n");
							count++;

						}
					}
				}

			}

		} else {

			for (int i = start * 10 + startTemp; i <= end * 10 + endTemp; i++) {

				if (isMove) {
					String eofIsZero = baseUrl
							.replaceAll("\\[change\\]\\[page\\]",
									String.valueOf(addZero(i, fillZero + 1, stripZeroPrefix)))
							.replaceAll("\\[move\\]", addMove(i, moveSize, quyu));
					sb.append(eofIsZero + ",\n");
					count++;

				} else {

					String eofIsZero = baseUrl.replaceAll("\\[change\\]\\[page\\]",
							String.valueOf(addZero(i, fillZero + 1, stripZeroPrefix)));
					sb.append(eofIsZero + ",\n");
					count++;
				}
			}
		}

		sb.deleteCharAt(sb.length() - 2);
		System.out.println(sb);
		
		System.err.println("总共生成" + count + "条URL");
		

	}

	private static String addMove(String str, int targetLen, int quyu) {

		int value = (int) (Integer.valueOf(str) / (Math.pow(10, quyu)));
		String yu = String.valueOf(value);
		int len = yu.length();
		String targetStr = "";

		for (int i = 0; i < targetLen - len; i++) {
			targetStr += "0";

		}

		return targetStr + yu;
	}

	private static String addMove(int value, int targetLen, int quyu) {
		value = (int) (value / (Math.pow(10, quyu)));
		String yu = String.valueOf(value);
		int len = yu.length();
		String targetStr = "";

		for (int i = 0; i < targetLen - len; i++) {
			targetStr += "0";

		}

		return targetStr + yu;
	}

	private static String addZero(String str, int targetLen, boolean isStripZeroPrefix) {
		if (isStripZeroPrefix) {

			return str;
		}
		int len = str.length();
		String targetStr = "";

		for (int i = 0; i < targetLen - len; i++) {
			targetStr += "0";

		}

		return targetStr + str;
	}

	private static String addZero(int va, int targetLen, boolean isStripZeroPrefix) {
		String str = String.valueOf(va);
		if (isStripZeroPrefix) {

			return str;
		}
		int len = str.length();
		String targetStr = "";

		for (int i = 0; i < targetLen - len; i++) {
			targetStr += "0";

		}

		return targetStr + str;
	}

}
