package jogo.model;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Camada implements Serializable{
	
	private static final long serialVersionUID = -2930090981169618231L;

	public  int mapa[][];
	
	private int mapaWidth;
	
	private int mapaHeight;
	
	private int tileWidth = 16 ;
	
	private int tileHeight =16;
	
	private String nomeTileSet;
	
	private transient BufferedImage camadaImg;

	public Camada(int[][] mapa ) {
		this.mapa = mapa;
		this.mapaWidth= mapa[0].length;
		this.mapaHeight= mapa.length;
	}

	public void montarMapa(BufferedImage tileSet) {
		this.camadaImg = new BufferedImage(mapaWidth*tileWidth, mapaHeight*tileHeight, BufferedImage.TYPE_4BYTE_ABGR);
		this.camadaImg.createGraphics();
		int tile;
		int tileRow;
		int tileCol;
		int colunasTileSet=tileSet.getWidth()/tileWidth;
		for (int i = 0; i < mapaHeight ; i++) {
			for (int j = 0; j <mapaWidth ; j++) {
				tile = (mapa[i][j] != -1) ? (mapa[i][j]) : 6;
				tileRow = (tile / (colunasTileSet)) | 0;
				tileCol = (tile % (colunasTileSet)) | 0;
				this.camadaImg.getGraphics().drawImage(tileSet, (j * tileHeight), (i * tileWidth), (j * tileHeight) + tileHeight,
						(i * tileWidth) + tileWidth, (tileCol * tileHeight), (tileRow * tileWidth),
						(tileCol * tileHeight) + tileHeight, (tileRow * tileWidth) + tileWidth, null);
			}
		}
	}
	
	public List<Rectangle> gerarColisoes() {
		List<Rectangle> colisoes = new ArrayList<>();
		for(int linha = 0; linha < mapaHeight ; linha++)
			for(int coluna = 0; coluna < mapaWidth ; coluna++) 
				if((mapa[linha][coluna] != -1))
					colisoes.add(new Rectangle(coluna*tileWidth,linha*tileHeight,tileWidth,tileHeight));
		return colisoes;
	}
	
	
	
	public int getMapaWidth() {
		return mapaWidth;
	}

	public void setMapaWidth(int mapaWidth) {
		this.mapaWidth = mapaWidth;
	}

	public int getMapaHeight() {
		return mapaHeight;
	}

	public void setMapaHeight(int mapaHeight) {
		this.mapaHeight = mapaHeight;
	}

	public String getNomeTileSet() {
		return nomeTileSet;
	}
	
	public BufferedImage getCamadaImg() {
		return camadaImg;
	}
}