package com.Mr_Galaxy.Subcraft_3.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * 
 * @author Mr_Galaxy
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class general_machine_block extends Block
{
	public general_machine_block(int id, Material material) 
	{
		super(material);
		//this.setCreativeTab(Subcraft_2.Subcraft_2_Machine_tab);
	}
	
	//@SideOnly(Side.CLIENT)
    //public void registerIcons(IconRegister par1IconRegister)
	//{
	//	this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
	//}
}