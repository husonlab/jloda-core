/*
 *  Copyright (C) 2018. Daniel H. Huson
 *
 *  (Some files contain contributions from other authors, who are then mentioned separately.)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * AColor.java Copyright (C) 2023 Daniel H. Huson
 *
 * (Some files contain contributions from other authors, who are then mentioned separately.)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package jloda.util;

import java.util.HashMap;
import java.util.Map;

public class AColor {
	private int value;

	public AColor() {
	}

	public AColor(int rgb) {
		value = 0xff000000 | rgb;
	}

	public AColor(int r, int g, int b) {
		this(r, g, b, 255);
	}

	public AColor(int r, int g, int b, int a) {
		value = ((a & 0xFF) << 24) |
				((r & 0xFF) << 16) |
				((g & 0xFF) << 8) |
				((b & 0xFF));
	}


	public AColor(AColor color, double alpha) {
		this(color.getRed(), color.getGreen(), color.getBlue(), (int) (alpha * 255 + 0.5));
	}

	public int getRed() {
		return (value >> 16) & 0xFF;
	}

	public int getGreen() {
		return (value >> 8) & 0xFF;
	}

	public int getBlue() {
		return (value) & 0xFF;
	}

	public int getAlpha() {
		return (value >> 24) & 0xff;
	}

	public AColor(float r, float g, float b, float a) {
		this((int) (r * 255 + 0.5), (int) (g * 255 + 0.5), (int) (b * 255 + 0.5), (int) (a * 255 + 0.5));
	}

	private final static Map<String, AColor> table = new HashMap<>();


	private static void init() {
		table.put("snow", new AColor(0xfffafa));
		table.put("ghostwhite", new AColor(0xf8f8ff));
		table.put("whitesmoke", new AColor(0xf5f5f5));
		table.put("gainsboro", new AColor(0xdcdcdc));
		table.put("floralwhite", new AColor(0xfffaf0));
		table.put("oldlace", new AColor(0xfdf5e6));
		table.put("linen", new AColor(0xfaf0e6));
		table.put("antiquewhite", new AColor(0xfaebd7));
		table.put("papayawhip", new AColor(0xffefd5));
		table.put("blanchedalmond", new AColor(0xffebcd));
		table.put("bisque", new AColor(0xffe4c4));
		table.put("peachpuff", new AColor(0xffdab9));
		table.put("navajowhite", new AColor(0xffdead));
		table.put("moccasin", new AColor(0xffe4b5));
		table.put("cornsilk", new AColor(0xfff8dc));
		table.put("ivory", new AColor(0xfffff0));
		table.put("lemonchiffon", new AColor(0xfffacd));
		table.put("seashell", new AColor(0xfff5ee));
		table.put("honeydew", new AColor(0xf0fff0));
		table.put("mintcream", new AColor(0xf5fffa));
		table.put("azure", new AColor(0xf0ffff));
		table.put("aliceblue", new AColor(0xf0f8ff));
		table.put("lavender", new AColor(0xe6e6fa));
		table.put("lavenderblush", new AColor(0xfff0f5));
		table.put("mistyrose", new AColor(0xffe4e1));
		table.put("white", new AColor(0xffffff));
		table.put("black", new AColor(0x000000));
		table.put("darkslategray", new AColor(0x2f4f4f));
		table.put("darkslategrey", new AColor(0x2f4f4f));
		table.put("dimgray", new AColor(0x696969));
		table.put("dimgrey", new AColor(0x696969));
		table.put("slategray", new AColor(0x708090));
		table.put("slategrey", new AColor(0x708090));
		table.put("lightslategray", new AColor(0x778899));
		table.put("lightslategrey", new AColor(0x778899));
		table.put("gray", new AColor(0xbebebe));
		table.put("grey", new AColor(0xbebebe));
		table.put("lightgrey", new AColor(0xd3d3d3));
		table.put("lightgray", new AColor(0xd3d3d3));
		table.put("midnightblue", new AColor(0x191970));
		table.put("navy", new AColor(0x000080));
		table.put("navyblue", new AColor(0x000080));
		table.put("cornflowerblue", new AColor(0x6495ed));
		table.put("darkslateblue", new AColor(0x483d8b));
		table.put("slateblue", new AColor(0x6a5acd));
		table.put("mediumslateblue", new AColor(0x7b68ee));
		table.put("lightslateblue", new AColor(0x8470ff));
		table.put("mediumblue", new AColor(0x0000cd));
		table.put("royalblue", new AColor(0x4169e1));
		table.put("blue", new AColor(0x0000ff));
		table.put("dodgerblue", new AColor(0x1e90ff));
		table.put("deepskyblue", new AColor(0x00bfff));
		table.put("skyblue", new AColor(0x87ceeb));
		table.put("lightskyblue", new AColor(0x87cefa));
		table.put("steelblue", new AColor(0x4682b4));
		table.put("lightsteelblue", new AColor(0xb0c4de));
		table.put("lightblue", new AColor(0xadd8e6));
		table.put("powderblue", new AColor(0xb0e0e6));
		table.put("paleturquoise", new AColor(0xafeeee));
		table.put("darkturquoise", new AColor(0x00ced1));
		table.put("mediumturquoise", new AColor(0x48d1cc));
		table.put("turquoise", new AColor(0x40e0d0));
		table.put("cyan", new AColor(0x00ffff));
		table.put("lightcyan", new AColor(0xe0ffff));
		table.put("cadetblue", new AColor(0x5f9ea0));
		table.put("mediumaquamarine", new AColor(0x66cdaa));
		table.put("aquamarine", new AColor(0x7fffd4));
		table.put("darkgreen", new AColor(0x006400));
		table.put("darkolivegreen", new AColor(0x556b2f));
		table.put("darkseagreen", new AColor(0x8fbc8f));
		table.put("seagreen", new AColor(0x2e8b57));
		table.put("mediumseagreen", new AColor(0x3cb371));
		table.put("lightseagreen", new AColor(0x20b2aa));
		table.put("palegreen", new AColor(0x98fb98));
		table.put("springgreen", new AColor(0x00ff7f));
		table.put("lawngreen", new AColor(0x7cfc00));
		table.put("chartreuse", new AColor(0x7fff00));
		table.put("mediumspringgreen", new AColor(0x00fa9a));
		table.put("greenyellow", new AColor(0xadff2f));
		table.put("limegreen", new AColor(0x32cd32));
		table.put("yellowgreen", new AColor(0x9acd32));
		table.put("forestgreen", new AColor(0x228b22));
		table.put("olivedrab", new AColor(0x6b8e23));
		table.put("darkkhaki", new AColor(0xbdb76b));
		table.put("khaki", new AColor(0xf0e68c));
		table.put("palegoldenrod", new AColor(0xeee8aa));
		table.put("lightgoldenrodyellow", new AColor(0xfafad2));
		table.put("lightyellow", new AColor(0xffffe0));
		table.put("yellow", new AColor(0xffff00));
		table.put("gold", new AColor(0xffd700));
		table.put("lightgoldenrod", new AColor(0xeedd82));
		table.put("goldenrod", new AColor(0xdaa520));
		table.put("darkgoldenrod", new AColor(0xb8860b));
		table.put("rosybrown", new AColor(0xbc8f8f));
		table.put("indianred", new AColor(0xcd5c5c));
		table.put("saddlebrown", new AColor(0x8b4513));
		table.put("sienna", new AColor(0xa0522d));
		table.put("peru", new AColor(0xcd853f));
		table.put("burlywood", new AColor(0xdeb887));
		table.put("beige", new AColor(0xf5f5dc));
		table.put("wheat", new AColor(0xf5deb3));
		table.put("sandybrown", new AColor(0xf4a460));
		table.put("tan", new AColor(0xd2b48c));
		table.put("chocolate", new AColor(0xd2691e));
		table.put("firebrick", new AColor(0xb22222));
		table.put("brown", new AColor(0xa52a2a));
		table.put("darksalmon", new AColor(0xe9967a));
		table.put("salmon", new AColor(0xfa8072));
		table.put("lightsalmon", new AColor(0xffa07a));
		table.put("orange", new AColor(0xffa500));
		table.put("darkorange", new AColor(0xff8c00));
		table.put("coral", new AColor(0xff7f50));
		table.put("lightcoral", new AColor(0xf08080));
		table.put("tomato", new AColor(0xff6347));
		table.put("orangered", new AColor(0xff4500));
		table.put("red", new AColor(0xff0000));
		table.put("hotpink", new AColor(0xff69b4));
		table.put("deeppink", new AColor(0xff1493));
		table.put("pink", new AColor(0xffc0cb));
		table.put("lightpink", new AColor(0xffb6c1));
		table.put("palevioletred", new AColor(0xdb7093));
		table.put("maroon", new AColor(0xb03060));
		table.put("mediumvioletred", new AColor(0xc71585));
		table.put("violetred", new AColor(0xd02090));
		table.put("magenta", new AColor(0xff00ff));
		table.put("violet", new AColor(0xee82ee));
		table.put("plum", new AColor(0xdda0dd));
		table.put("orchid", new AColor(0xda70d6));
		table.put("mediumorchid", new AColor(0xba55d3));
		table.put("darkorchid", new AColor(0x9932cc));
		table.put("darkviolet", new AColor(0x9400d3));
		table.put("blueviolet", new AColor(0x8a2be2));
		table.put("purple", new AColor(0xa020f0));
		table.put("mediumpurple", new AColor(0x9370db));
		table.put("thistle", new AColor(0xd8bfd8));
		table.put("snow1", new AColor(0xfffafa));
		table.put("snow2", new AColor(0xeee9e9));
		table.put("snow3", new AColor(0xcdc9c9));
		table.put("snow4", new AColor(0x8b8989));
		table.put("seashell1", new AColor(0xfff5ee));
		table.put("seashell2", new AColor(0xeee5de));
		table.put("seashell3", new AColor(0xcdc5bf));
		table.put("seashell4", new AColor(0x8b8682));
		table.put("antiquewhite1", new AColor(0xffefdb));
		table.put("antiquewhite2", new AColor(0xeedfcc));
		table.put("antiquewhite3", new AColor(0xcdc0b0));
		table.put("antiquewhite4", new AColor(0x8b8378));
		table.put("bisque1", new AColor(0xffe4c4));
		table.put("bisque2", new AColor(0xeed5b7));
		table.put("bisque3", new AColor(0xcdb79e));
		table.put("bisque4", new AColor(0x8b7d6b));
		table.put("peachpuff1", new AColor(0xffdab9));
		table.put("peachpuff2", new AColor(0xeecbad));
		table.put("peachpuff3", new AColor(0xcdaf95));
		table.put("peachpuff4", new AColor(0x8b7765));
		table.put("navajowhite1", new AColor(0xffdead));
		table.put("navajowhite2", new AColor(0xeecfa1));
		table.put("navajowhite3", new AColor(0xcdb38b));
		table.put("navajowhite4", new AColor(0x8b795e));
		table.put("lemonchiffon1", new AColor(0xfffacd));
		table.put("lemonchiffon2", new AColor(0xeee9bf));
		table.put("lemonchiffon3", new AColor(0xcdc9a5));
		table.put("lemonchiffon4", new AColor(0x8b8970));
		table.put("cornsilk1", new AColor(0xfff8dc));
		table.put("cornsilk2", new AColor(0xeee8cd));
		table.put("cornsilk3", new AColor(0xcdc8b1));
		table.put("cornsilk4", new AColor(0x8b8878));
		table.put("ivory1", new AColor(0xfffff0));
		table.put("ivory2", new AColor(0xeeeee0));
		table.put("ivory3", new AColor(0xcdcdc1));
		table.put("ivory4", new AColor(0x8b8b83));
		table.put("honeydew1", new AColor(0xf0fff0));
		table.put("honeydew2", new AColor(0xe0eee0));
		table.put("honeydew3", new AColor(0xc1cdc1));
		table.put("honeydew4", new AColor(0x838b83));
		table.put("lavenderblush1", new AColor(0xfff0f5));
		table.put("lavenderblush2", new AColor(0xeee0e5));
		table.put("lavenderblush3", new AColor(0xcdc1c5));
		table.put("lavenderblush4", new AColor(0x8b8386));
		table.put("mistyrose1", new AColor(0xffe4e1));
		table.put("mistyrose2", new AColor(0xeed5d2));
		table.put("mistyrose3", new AColor(0xcdb7b5));
		table.put("mistyrose4", new AColor(0x8b7d7b));
		table.put("azure1", new AColor(0xf0ffff));
		table.put("azure2", new AColor(0xe0eeee));
		table.put("azure3", new AColor(0xc1cdcd));
		table.put("azure4", new AColor(0x838b8b));
		table.put("slateblue1", new AColor(0x836fff));
		table.put("slateblue2", new AColor(0x7a67ee));
		table.put("slateblue3", new AColor(0x6959cd));
		table.put("slateblue4", new AColor(0x473c8b));
		table.put("royalblue1", new AColor(0x4876ff));
		table.put("royalblue2", new AColor(0x436eee));
		table.put("royalblue3", new AColor(0x3a5fcd));
		table.put("royalblue4", new AColor(0x27408b));
		table.put("blue1", new AColor(0x0000ff));
		table.put("blue2", new AColor(0x0000ee));
		table.put("blue3", new AColor(0x0000cd));
		table.put("blue4", new AColor(0x00008b));
		table.put("dodgerblue1", new AColor(0x1e90ff));
		table.put("dodgerblue2", new AColor(0x1c86ee));
		table.put("dodgerblue3", new AColor(0x1874cd));
		table.put("dodgerblue4", new AColor(0x104e8b));
		table.put("steelblue1", new AColor(0x63b8ff));
		table.put("steelblue2", new AColor(0x5cacee));
		table.put("steelblue3", new AColor(0x4f94cd));
		table.put("steelblue4", new AColor(0x36648b));
		table.put("deepskyblue1", new AColor(0x00bfff));
		table.put("deepskyblue2", new AColor(0x00b2ee));
		table.put("deepskyblue3", new AColor(0x009acd));
		table.put("deepskyblue4", new AColor(0x00688b));
		table.put("skyblue1", new AColor(0x87ceff));
		table.put("skyblue2", new AColor(0x7ec0ee));
		table.put("skyblue3", new AColor(0x6ca6cd));
		table.put("skyblue4", new AColor(0x4a708b));
		table.put("lightskyblue1", new AColor(0xb0e2ff));
		table.put("lightskyblue2", new AColor(0xa4d3ee));
		table.put("lightskyblue3", new AColor(0x8db6cd));
		table.put("lightskyblue4", new AColor(0x607b8b));
		table.put("slategray1", new AColor(0xc6e2ff));
		table.put("slategray2", new AColor(0xb9d3ee));
		table.put("slategray3", new AColor(0x9fb6cd));
		table.put("slategray4", new AColor(0x6c7b8b));
		table.put("lightsteelblue1", new AColor(0xcae1ff));
		table.put("lightsteelblue2", new AColor(0xbcd2ee));
		table.put("lightsteelblue3", new AColor(0xa2b5cd));
		table.put("lightsteelblue4", new AColor(0x6e7b8b));
		table.put("lightblue1", new AColor(0xbfefff));
		table.put("lightblue2", new AColor(0xb2dfee));
		table.put("lightblue3", new AColor(0x9ac0cd));
		table.put("lightblue4", new AColor(0x68838b));
		table.put("lightcyan1", new AColor(0xe0ffff));
		table.put("lightcyan2", new AColor(0xd1eeee));
		table.put("lightcyan3", new AColor(0xb4cdcd));
		table.put("lightcyan4", new AColor(0x7a8b8b));
		table.put("paleturquoise1", new AColor(0xbbffff));
		table.put("paleturquoise2", new AColor(0xaeeeee));
		table.put("paleturquoise3", new AColor(0x96cdcd));
		table.put("paleturquoise4", new AColor(0x668b8b));
		table.put("cadetblue1", new AColor(0x98f5ff));
		table.put("cadetblue2", new AColor(0x8ee5ee));
		table.put("cadetblue3", new AColor(0x7ac5cd));
		table.put("cadetblue4", new AColor(0x53868b));
		table.put("turquoise1", new AColor(0x00f5ff));
		table.put("turquoise2", new AColor(0x00e5ee));
		table.put("turquoise3", new AColor(0x00c5cd));
		table.put("turquoise4", new AColor(0x00868b));
		table.put("cyan1", new AColor(0x00ffff));
		table.put("cyan2", new AColor(0x00eeee));
		table.put("cyan3", new AColor(0x00cdcd));
		table.put("cyan4", new AColor(0x008b8b));
		table.put("darkslategray1", new AColor(0x97ffff));
		table.put("darkslategray2", new AColor(0x8deeee));
		table.put("darkslategray3", new AColor(0x79cdcd));
		table.put("darkslategray4", new AColor(0x528b8b));
		table.put("aquamarine1", new AColor(0x7fffd4));
		table.put("aquamarine2", new AColor(0x76eec6));
		table.put("aquamarine3", new AColor(0x66cdaa));
		table.put("aquamarine4", new AColor(0x458b74));
		table.put("darkseagreen1", new AColor(0xc1ffc1));
		table.put("darkseagreen2", new AColor(0xb4eeb4));
		table.put("darkseagreen3", new AColor(0x9bcd9b));
		table.put("darkseagreen4", new AColor(0x698b69));
		table.put("seagreen1", new AColor(0x54ff9f));
		table.put("seagreen2", new AColor(0x4eee94));
		table.put("seagreen3", new AColor(0x43cd80));
		table.put("seagreen4", new AColor(0x2e8b57));
		table.put("palegreen1", new AColor(0x9aff9a));
		table.put("palegreen2", new AColor(0x90ee90));
		table.put("palegreen3", new AColor(0x7ccd7c));
		table.put("palegreen4", new AColor(0x548b54));
		table.put("springgreen1", new AColor(0x00ff7f));
		table.put("springgreen2", new AColor(0x00ee76));
		table.put("springgreen3", new AColor(0x00cd66));
		table.put("springgreen4", new AColor(0x008b45));
		table.put("green1", new AColor(0x00ff00));
		table.put("green2", new AColor(0x00ee00));
		table.put("green3", new AColor(0x00cd00));
		table.put("green4", new AColor(0x008b00));
		table.put("chartreuse1", new AColor(0x7fff00));
		table.put("chartreuse2", new AColor(0x76ee00));
		table.put("chartreuse3", new AColor(0x66cd00));
		table.put("chartreuse4", new AColor(0x458b00));
		table.put("olivedrab1", new AColor(0xc0ff3e));
		table.put("olivedrab2", new AColor(0xb3ee3a));
		table.put("olivedrab3", new AColor(0x9acd32));
		table.put("olivedrab4", new AColor(0x698b22));
		table.put("darkolivegreen1", new AColor(0xcaff70));
		table.put("darkolivegreen2", new AColor(0xbcee68));
		table.put("darkolivegreen3", new AColor(0xa2cd5a));
		table.put("darkolivegreen4", new AColor(0x6e8b3d));
		table.put("khaki1", new AColor(0xfff68f));
		table.put("khaki2", new AColor(0xeee685));
		table.put("khaki3", new AColor(0xcdc673));
		table.put("khaki4", new AColor(0x8b864e));
		table.put("lightgoldenrod1", new AColor(0xffec8b));
		table.put("lightgoldenrod2", new AColor(0xeedc82));
		table.put("lightgoldenrod3", new AColor(0xcdbe70));
		table.put("lightgoldenrod4", new AColor(0x8b814c));
		table.put("lightyellow1", new AColor(0xffffe0));
		table.put("lightyellow2", new AColor(0xeeeed1));
		table.put("lightyellow3", new AColor(0xcdcdb4));
		table.put("lightyellow4", new AColor(0x8b8b7a));
		table.put("yellow1", new AColor(0xffff00));
		table.put("yellow2", new AColor(0xeeee00));
		table.put("yellow3", new AColor(0xcdcd00));
		table.put("yellow4", new AColor(0x8b8b00));
		table.put("gold1", new AColor(0xffd700));
		table.put("gold2", new AColor(0xeec900));
		table.put("gold3", new AColor(0xcdad00));
		table.put("gold4", new AColor(0x8b7500));
		table.put("goldenrod1", new AColor(0xffc125));
		table.put("goldenrod2", new AColor(0xeeb422));
		table.put("goldenrod3", new AColor(0xcd9b1d));
		table.put("goldenrod4", new AColor(0x8b6914));
		table.put("darkgoldenrod1", new AColor(0xffb90f));
		table.put("darkgoldenrod2", new AColor(0xeead0e));
		table.put("darkgoldenrod3", new AColor(0xcd950c));
		table.put("darkgoldenrod4", new AColor(0x8b6508));
		table.put("rosybrown1", new AColor(0xffc1c1));
		table.put("rosybrown2", new AColor(0xeeb4b4));
		table.put("rosybrown3", new AColor(0xcd9b9b));
		table.put("rosybrown4", new AColor(0x8b6969));
		table.put("indianred1", new AColor(0xff6a6a));
		table.put("indianred2", new AColor(0xee6363));
		table.put("indianred3", new AColor(0xcd5555));
		table.put("indianred4", new AColor(0x8b3a3a));
		table.put("sienna1", new AColor(0xff8247));
		table.put("sienna2", new AColor(0xee7942));
		table.put("sienna3", new AColor(0xcd6839));
		table.put("sienna4", new AColor(0x8b4726));
		table.put("burlywood1", new AColor(0xffd39b));
		table.put("burlywood2", new AColor(0xeec591));
		table.put("burlywood3", new AColor(0xcdaa7d));
		table.put("burlywood4", new AColor(0x8b7355));
		table.put("wheat1", new AColor(0xffe7ba));
		table.put("wheat2", new AColor(0xeed8ae));
		table.put("wheat3", new AColor(0xcdba96));
		table.put("wheat4", new AColor(0x8b7e66));
		table.put("tan1", new AColor(0xffa54f));
		table.put("tan2", new AColor(0xee9a49));
		table.put("tan3", new AColor(0xcd853f));
		table.put("tan4", new AColor(0x8b5a2b));
		table.put("chocolate1", new AColor(0xff7f24));
		table.put("chocolate2", new AColor(0xee7621));
		table.put("chocolate3", new AColor(0xcd661d));
		table.put("chocolate4", new AColor(0x8b4513));
		table.put("firebrick1", new AColor(0xff3030));
		table.put("firebrick2", new AColor(0xee2c2c));
		table.put("firebrick3", new AColor(0xcd2626));
		table.put("firebrick4", new AColor(0x8b1a1a));
		table.put("brown1", new AColor(0xff4040));
		table.put("brown2", new AColor(0xee3b3b));
		table.put("brown3", new AColor(0xcd3333));
		table.put("brown4", new AColor(0x8b2323));
		table.put("salmon1", new AColor(0xff8c69));
		table.put("salmon2", new AColor(0xee8262));
		table.put("salmon3", new AColor(0xcd7054));
		table.put("salmon4", new AColor(0x8b4c39));
		table.put("lightsalmon1", new AColor(0xffa07a));
		table.put("lightsalmon2", new AColor(0xee9572));
		table.put("lightsalmon3", new AColor(0xcd8162));
		table.put("lightsalmon4", new AColor(0x8b5742));
		table.put("orange1", new AColor(0xffa500));
		table.put("orange2", new AColor(0xee9a00));
		table.put("orange3", new AColor(0xcd8500));
		table.put("orange4", new AColor(0x8b5a00));
		table.put("darkorange1", new AColor(0xff7f00));
		table.put("darkorange2", new AColor(0xee7600));
		table.put("darkorange3", new AColor(0xcd6600));
		table.put("darkorange4", new AColor(0x8b4500));
		table.put("coral1", new AColor(0xff7256));
		table.put("coral2", new AColor(0xee6a50));
		table.put("coral3", new AColor(0xcd5b45));
		table.put("coral4", new AColor(0x8b3e2f));
		table.put("tomato1", new AColor(0xff6347));
		table.put("tomato2", new AColor(0xee5c42));
		table.put("tomato3", new AColor(0xcd4f39));
		table.put("tomato4", new AColor(0x8b3626));
		table.put("orangered1", new AColor(0xff4500));
		table.put("orangered2", new AColor(0xee4000));
		table.put("orangered3", new AColor(0xcd3700));
		table.put("orangered4", new AColor(0x8b2500));
		table.put("red1", new AColor(0xff0000));
		table.put("red2", new AColor(0xee0000));
		table.put("red3", new AColor(0xcd0000));
		table.put("red4", new AColor(0x8b0000));
		table.put("deeppink1", new AColor(0xff1493));
		table.put("deeppink2", new AColor(0xee1289));
		table.put("deeppink3", new AColor(0xcd1076));
		table.put("deeppink4", new AColor(0x8b0a50));
		table.put("hotpink1", new AColor(0xff6eb4));
		table.put("hotpink2", new AColor(0xee6aa7));
		table.put("hotpink3", new AColor(0xcd6090));
		table.put("hotpink4", new AColor(0x8b3a62));
		table.put("pink1", new AColor(0xffb5c5));
		table.put("pink2", new AColor(0xeea9b8));
		table.put("pink3", new AColor(0xcd919e));
		table.put("pink4", new AColor(0x8b636c));
		table.put("lightpink1", new AColor(0xffaeb9));
		table.put("lightpink2", new AColor(0xeea2ad));
		table.put("lightpink3", new AColor(0xcd8c95));
		table.put("lightpink4", new AColor(0x8b5f65));
		table.put("palevioletred1", new AColor(0xff82ab));
		table.put("palevioletred2", new AColor(0xee799f));
		table.put("palevioletred3", new AColor(0xcd6889));
		table.put("palevioletred4", new AColor(0x8b475d));
		table.put("maroon1", new AColor(0xff34b3));
		table.put("maroon2", new AColor(0xee30a7));
		table.put("maroon3", new AColor(0xcd2990));
		table.put("maroon4", new AColor(0x8b1c62));
		table.put("violetred1", new AColor(0xff3e96));
		table.put("violetred2", new AColor(0xee3a8c));
		table.put("violetred3", new AColor(0xcd3278));
		table.put("violetred4", new AColor(0x8b2252));
		table.put("magenta1", new AColor(0xff00ff));
		table.put("magenta2", new AColor(0xee00ee));
		table.put("magenta3", new AColor(0xcd00cd));
		table.put("magenta4", new AColor(0x8b008b));
		table.put("orchid1", new AColor(0xff83fa));
		table.put("orchid2", new AColor(0xee7ae9));
		table.put("orchid3", new AColor(0xcd69c9));
		table.put("orchid4", new AColor(0x8b4789));
		table.put("plum1", new AColor(0xffbbff));
		table.put("plum2", new AColor(0xeeaeee));
		table.put("plum3", new AColor(0xcd96cd));
		table.put("plum4", new AColor(0x8b668b));
		table.put("mediumorchid1", new AColor(0xe066ff));
		table.put("mediumorchid2", new AColor(0xd15fee));
		table.put("mediumorchid3", new AColor(0xb452cd));
		table.put("mediumorchid4", new AColor(0x7a378b));
		table.put("darkorchid1", new AColor(0xbf3eff));
		table.put("darkorchid2", new AColor(0xb23aee));
		table.put("darkorchid3", new AColor(0x9a32cd));
		table.put("darkorchid4", new AColor(0x68228b));
		table.put("purple1", new AColor(0x9b30ff));
		table.put("purple2", new AColor(0x912cee));
		table.put("purple3", new AColor(0x7d26cd));
		table.put("purple4", new AColor(0x551a8b));
		table.put("mediumpurple1", new AColor(0xab82ff));
		table.put("mediumpurple2", new AColor(0x9f79ee));
		table.put("mediumpurple3", new AColor(0x8968cd));
		table.put("mediumpurple4", new AColor(0x5d478b));
		table.put("thistle1", new AColor(0xffe1ff));
		table.put("thistle2", new AColor(0xeed2ee));
		table.put("thistle3", new AColor(0xcdb5cd));
		table.put("thistle4", new AColor(0x8b7b8b));
		table.put("gray0", new AColor(0x000000));
		table.put("grey0", new AColor(0x000000));
		table.put("gray1", new AColor(0x030303));
		table.put("grey1", new AColor(0x030303));
		table.put("gray2", new AColor(0x050505));
		table.put("grey2", new AColor(0x050505));
		table.put("gray3", new AColor(0x080808));
		table.put("grey3", new AColor(0x080808));
		table.put("gray4", new AColor(0x0a0a0a));
		table.put("grey4", new AColor(0x0a0a0a));
		table.put("gray5", new AColor(0x0d0d0d));
		table.put("grey5", new AColor(0x0d0d0d));
		table.put("gray6", new AColor(0x0f0f0f));
		table.put("grey6", new AColor(0x0f0f0f));
		table.put("gray7", new AColor(0x121212));
		table.put("grey7", new AColor(0x121212));
		table.put("gray8", new AColor(0x141414));
		table.put("grey8", new AColor(0x141414));
		table.put("gray9", new AColor(0x171717));
		table.put("grey9", new AColor(0x171717));
		table.put("gray10", new AColor(0x1a1a1a));
		table.put("grey10", new AColor(0x1a1a1a));
		table.put("gray11", new AColor(0x1c1c1c));
		table.put("grey11", new AColor(0x1c1c1c));
		table.put("gray12", new AColor(0x1f1f1f));
		table.put("grey12", new AColor(0x1f1f1f));
		table.put("gray13", new AColor(0x212121));
		table.put("grey13", new AColor(0x212121));
		table.put("gray14", new AColor(0x242424));
		table.put("grey14", new AColor(0x242424));
		table.put("gray15", new AColor(0x262626));
		table.put("grey15", new AColor(0x262626));
		table.put("gray16", new AColor(0x292929));
		table.put("grey16", new AColor(0x292929));
		table.put("gray17", new AColor(0x2b2b2b));
		table.put("grey17", new AColor(0x2b2b2b));
		table.put("gray18", new AColor(0x2e2e2e));
		table.put("grey18", new AColor(0x2e2e2e));
		table.put("gray19", new AColor(0x303030));
		table.put("grey19", new AColor(0x303030));
		table.put("gray20", new AColor(0x333333));
		table.put("grey20", new AColor(0x333333));
		table.put("gray21", new AColor(0x363636));
		table.put("grey21", new AColor(0x363636));
		table.put("gray22", new AColor(0x383838));
		table.put("grey22", new AColor(0x383838));
		table.put("gray23", new AColor(0x3b3b3b));
		table.put("grey23", new AColor(0x3b3b3b));
		table.put("gray24", new AColor(0x3d3d3d));
		table.put("grey24", new AColor(0x3d3d3d));
		table.put("gray25", new AColor(0x404040));
		table.put("grey25", new AColor(0x404040));
		table.put("gray26", new AColor(0x424242));
		table.put("grey26", new AColor(0x424242));
		table.put("gray27", new AColor(0x454545));
		table.put("grey27", new AColor(0x454545));
		table.put("gray28", new AColor(0x474747));
		table.put("grey28", new AColor(0x474747));
		table.put("gray29", new AColor(0x4a4a4a));
		table.put("grey29", new AColor(0x4a4a4a));
		table.put("gray30", new AColor(0x4d4d4d));
		table.put("grey30", new AColor(0x4d4d4d));
		table.put("gray31", new AColor(0x4f4f4f));
		table.put("grey31", new AColor(0x4f4f4f));
		table.put("gray32", new AColor(0x525252));
		table.put("grey32", new AColor(0x525252));
		table.put("gray33", new AColor(0x545454));
		table.put("grey33", new AColor(0x545454));
		table.put("gray34", new AColor(0x575757));
		table.put("grey34", new AColor(0x575757));
		table.put("gray35", new AColor(0x595959));
		table.put("grey35", new AColor(0x595959));
		table.put("gray36", new AColor(0x5c5c5c));
		table.put("grey36", new AColor(0x5c5c5c));
		table.put("gray37", new AColor(0x5e5e5e));
		table.put("grey37", new AColor(0x5e5e5e));
		table.put("gray38", new AColor(0x616161));
		table.put("grey38", new AColor(0x616161));
		table.put("gray39", new AColor(0x636363));
		table.put("grey39", new AColor(0x636363));
		table.put("gray40", new AColor(0x666666));
		table.put("grey40", new AColor(0x666666));
		table.put("gray41", new AColor(0x696969));
		table.put("grey41", new AColor(0x696969));
		table.put("gray42", new AColor(0x6b6b6b));
		table.put("grey42", new AColor(0x6b6b6b));
		table.put("gray43", new AColor(0x6e6e6e));
		table.put("grey43", new AColor(0x6e6e6e));
		table.put("gray44", new AColor(0x707070));
		table.put("grey44", new AColor(0x707070));
		table.put("gray45", new AColor(0x737373));
		table.put("grey45", new AColor(0x737373));
		table.put("gray46", new AColor(0x757575));
		table.put("grey46", new AColor(0x757575));
		table.put("gray47", new AColor(0x787878));
		table.put("grey47", new AColor(0x787878));
		table.put("gray48", new AColor(0x7a7a7a));
		table.put("grey48", new AColor(0x7a7a7a));
		table.put("gray49", new AColor(0x7d7d7d));
		table.put("grey49", new AColor(0x7d7d7d));
		table.put("gray50", new AColor(0x7f7f7f));
		table.put("grey50", new AColor(0x7f7f7f));
		table.put("gray51", new AColor(0x828282));
		table.put("grey51", new AColor(0x828282));
		table.put("gray52", new AColor(0x858585));
		table.put("grey52", new AColor(0x858585));
		table.put("gray53", new AColor(0x878787));
		table.put("grey53", new AColor(0x878787));
		table.put("gray54", new AColor(0x8a8a8a));
		table.put("grey54", new AColor(0x8a8a8a));
		table.put("gray55", new AColor(0x8c8c8c));
		table.put("grey55", new AColor(0x8c8c8c));
		table.put("gray56", new AColor(0x8f8f8f));
		table.put("grey56", new AColor(0x8f8f8f));
		table.put("gray57", new AColor(0x919191));
		table.put("grey57", new AColor(0x919191));
		table.put("gray58", new AColor(0x949494));
		table.put("grey58", new AColor(0x949494));
		table.put("gray59", new AColor(0x969696));
		table.put("grey59", new AColor(0x969696));
		table.put("gray60", new AColor(0x999999));
		table.put("grey60", new AColor(0x999999));
		table.put("gray61", new AColor(0x9c9c9c));
		table.put("grey61", new AColor(0x9c9c9c));
		table.put("gray62", new AColor(0x9e9e9e));
		table.put("grey62", new AColor(0x9e9e9e));
		table.put("gray63", new AColor(0xa1a1a1));
		table.put("grey63", new AColor(0xa1a1a1));
		table.put("gray64", new AColor(0xa3a3a3));
		table.put("grey64", new AColor(0xa3a3a3));
		table.put("gray65", new AColor(0xa6a6a6));
		table.put("grey65", new AColor(0xa6a6a6));
		table.put("gray66", new AColor(0xa8a8a8));
		table.put("grey66", new AColor(0xa8a8a8));
		table.put("gray67", new AColor(0xababab));
		table.put("grey67", new AColor(0xababab));
		table.put("gray68", new AColor(0xadadad));
		table.put("grey68", new AColor(0xadadad));
		table.put("gray69", new AColor(0xb0b0b0));
		table.put("grey69", new AColor(0xb0b0b0));
		table.put("gray70", new AColor(0xb3b3b3));
		table.put("grey70", new AColor(0xb3b3b3));
		table.put("gray71", new AColor(0xb5b5b5));
		table.put("grey71", new AColor(0xb5b5b5));
		table.put("gray72", new AColor(0xb8b8b8));
		table.put("grey72", new AColor(0xb8b8b8));
		table.put("gray73", new AColor(0xbababa));
		table.put("grey73", new AColor(0xbababa));
		table.put("gray74", new AColor(0xbdbdbd));
		table.put("grey74", new AColor(0xbdbdbd));
		table.put("gray75", new AColor(0xbfbfbf));
		table.put("grey75", new AColor(0xbfbfbf));
		table.put("gray76", new AColor(0xc2c2c2));
		table.put("grey76", new AColor(0xc2c2c2));
		table.put("gray77", new AColor(0xc4c4c4));
		table.put("grey77", new AColor(0xc4c4c4));
		table.put("gray78", new AColor(0xc7c7c7));
		table.put("grey78", new AColor(0xc7c7c7));
		table.put("gray79", new AColor(0xc9c9c9));
		table.put("grey79", new AColor(0xc9c9c9));
		table.put("gray80", new AColor(0xcccccc));
		table.put("grey80", new AColor(0xcccccc));
		table.put("gray81", new AColor(0xcfcfcf));
		table.put("grey81", new AColor(0xcfcfcf));
		table.put("gray82", new AColor(0xd1d1d1));
		table.put("grey82", new AColor(0xd1d1d1));
		table.put("gray83", new AColor(0xd4d4d4));
		table.put("grey83", new AColor(0xd4d4d4));
		table.put("gray84", new AColor(0xd6d6d6));
		table.put("grey84", new AColor(0xd6d6d6));
		table.put("gray85", new AColor(0xd9d9d9));
		table.put("grey85", new AColor(0xd9d9d9));
		table.put("gray86", new AColor(0xdbdbdb));
		table.put("grey86", new AColor(0xdbdbdb));
		table.put("gray87", new AColor(0xdedede));
		table.put("grey87", new AColor(0xdedede));
		table.put("gray88", new AColor(0xe0e0e0));
		table.put("grey88", new AColor(0xe0e0e0));
		table.put("gray89", new AColor(0xe3e3e3));
		table.put("grey89", new AColor(0xe3e3e3));
		table.put("gray90", new AColor(0xe5e5e5));
		table.put("grey90", new AColor(0xe5e5e5));
		table.put("gray91", new AColor(0xe8e8e8));
		table.put("grey91", new AColor(0xe8e8e8));
		table.put("gray92", new AColor(0xebebeb));
		table.put("grey92", new AColor(0xebebeb));
		table.put("gray93", new AColor(0xededed));
		table.put("grey93", new AColor(0xededed));
		table.put("gray94", new AColor(0xf0f0f0));
		table.put("grey94", new AColor(0xf0f0f0));
		table.put("gray95", new AColor(0xf2f2f2));
		table.put("grey95", new AColor(0xf2f2f2));
		table.put("gray96", new AColor(0xf5f5f5));
		table.put("grey96", new AColor(0xf5f5f5));
		table.put("gray97", new AColor(0xf7f7f7));
		table.put("grey97", new AColor(0xf7f7f7));
		table.put("gray98", new AColor(0xfafafa));
		table.put("grey98", new AColor(0xfafafa));
		table.put("gray99", new AColor(0xfcfcfc));
		table.put("grey99", new AColor(0xfcfcfc));
		table.put("gray100", new AColor(0xffffff));
		table.put("grey100", new AColor(0xffffff));
		table.put("darkgrey", new AColor(0xa9a9a9));
		table.put("darkgray", new AColor(0xa9a9a9));
		table.put("darkblue", new AColor(0x00008b));
		table.put("darkcyan", new AColor(0x008b8b));
		table.put("darkmagenta", new AColor(0x8b008b));
		table.put("darkred", new AColor(0x8b0000));
		table.put("lightgreen", new AColor(0x90ee90));
	}

	/**
	 * parse a color
	 *
	 * @return color or null
	 */
	public static AColor parseColor(String name) {
		if (table.isEmpty())
			init();
		return table.get(name.toLowerCase());
	}
}
