package cn.gargit.board;

import java.util.ArrayList;
import java.util.List;

import cn.gargit.object.GameConf;
import cn.gargit.view.*;

public class FullBoard extends AbstractBoard{
	protected List<Piece> createPieces(GameConf config, 
			Piece[][] pieces) {
		// 创建一个Piece集合，该集合里面存放初始化游戏时所需的Piece对象
		List<Piece> notNullPieces = new ArrayList<Piece>();
		for (int i = 1; i < pieces.length-1; i++) {
			for (int j = 1; j < pieces[i].length-1; j++) {
				// 先构造一个Piece对象，只设置它在Piece[][]数组中的索引值
				// 所需要的PieceImage由其父类负责设置
				Piece piece = new Piece(i,j);
				// 添加到Piece集合中
				notNullPieces.add(piece);
			}
			
		}
		return notNullPieces;
	}
}
