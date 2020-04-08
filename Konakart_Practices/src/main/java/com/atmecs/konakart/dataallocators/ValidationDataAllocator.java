package com.atmecs.konakart.dataallocators;

import java.util.Properties;

import com.atmecs.konakart.constants.FilePaths;
import com.atmecs.konakart.utils.ReadProperties;

public class ValidationDataAllocator {
		Properties properties;
		public String matroxName;
		public String matroxPrice;
		public String gameName;
		public String gamePrice;
		public String softName;
		public String softPrice;
		
		public void getValidationData() throws Exception {
			properties = ReadProperties.loadProperty(FilePaths.VALIDDATA_FILE);
			setGameName();
			setGamePrice();
			setMatroxName();
			setMatroxPrice();
			setSoftName();
			setSoftPrice();
		}

		public String getMatroxName() {
			return matroxName;
		}

		public void setMatroxName() {
			this.matroxName = properties.getProperty("valid.comp.matrox.name");
		}

		public String getMatroxPrice() {
			return matroxPrice;
		}

		public void setMatroxPrice() {
			this.matroxPrice = properties.getProperty("valid.com.matrox.price");
		}

		public String getGameName() {
			return gameName;
		}

		public void setGameName() {
			this.gameName = properties.getProperty("valid.game.cod.name");
		}

		public String getGamePrice() {
			return gamePrice;
		}

		public void setGamePrice() {
			this.gamePrice = properties.getProperty("valid.game.cod.price");
		}

		public String getSoftName() {
			return softName;
		}

		public void setSoftName() {
			this.softName = properties.getProperty("valid.soft.os.name");
		}

		public String getSoftPrice() {
			return softPrice;
		}

		public void setSoftPrice() {
			this.softPrice = properties.getProperty("valid.soft.os.price");
		}
		
		
}
