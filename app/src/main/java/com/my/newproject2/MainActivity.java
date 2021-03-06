package com.my.newproject2;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.ClipboardManager;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;


public class MainActivity extends Activity {

	private LinearLayout linear3;
	private ListView listview5;


	private ArrayList<String> Mortys = new ArrayList<>();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}

	private void initialize() {
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		listview5 = (ListView) findViewById(R.id.listview5);


	}

	private void initializeLogic() {
		Mortys.add(	0	,"	Morty	");
		Mortys.add(	1	,"	Scruffy Morty	");
		Mortys.add(	2	,"	Unkempt Morty	");
		Mortys.add(	3	,"	Hobo Morty	");
		Mortys.add(	4	,"	Old Morty	");
		Mortys.add(	5	,"	Geriatric Morty	");
		Mortys.add(	6	,"	Ancient Morty	");
		Mortys.add(	7	,"	Rabbit Morty	");
		Mortys.add(	8	,"	Evil Rabbit Morty	");
		Mortys.add(	9	,"	No Eye Morty	");
		Mortys.add(	10	,"	One Eye Morty	");
		Mortys.add(	11	,"	Three Eye Morty	");
		Mortys.add(	12	,"	Test X1 Morty	");
		Mortys.add(	13	,"	Test X46 Morty	");
		Mortys.add(	14	,"	Test X72 Morty	");
		Mortys.add(	15	,"	Self-Defense Morty	");
		Mortys.add(	16	,"	Karate Morty	");
		Mortys.add(	17	,"	No Mercy Morty	");
		Mortys.add(	18	,"	Mustache Morty	");
		Mortys.add(	19	,"	Beard Morty	");
		Mortys.add(	20	,"	Hipster Morty	");
		Mortys.add(	21	,"	Ad Space Morty	");
		Mortys.add(	22	,"	Jerry's Game Morty	");
		Mortys.add(	23	,"	Pocket Mortys Morty	");
		Mortys.add(	24	,"	Blue Shirt Morty	");
		Mortys.add(	25	,"	Red Shirt Morty	");
		Mortys.add(	26	,"	Orange Shirt Morty	");
		Mortys.add(	27	,"	Green Shirt Morty	");
		Mortys.add(	28	,"	Purple Shirt Morty	");
		Mortys.add(	29	,"	Rainbow Shirt Morty	");
		Mortys.add(	30	,"	Exo-Alpha Morty	");
		Mortys.add(	31	,"	Exo-Omega Morty	");
		Mortys.add(	32	,"	Exo-Prime Morty	");
		Mortys.add(	33	,"	Spoon Morty	");
		Mortys.add(	34	,"	Fork Morty	");
		Mortys.add(	35	,"	Spork Morty	");
		Mortys.add(	36	,"	Peace Morty	");
		Mortys.add(	37	,"	Hippie Morty	");
		Mortys.add(	38	,"	Off The Grid Morty	");
		Mortys.add(	39	,"	Big Head Morty	");
		Mortys.add(	40	,"	Giant Head Morty	");
		Mortys.add(	41	,"	Colossal Head Morty	");
		Mortys.add(	42	,"	Spooky Morty	");
		Mortys.add(	43	,"	Ghostly Morty	");
		Mortys.add(	44	,"	Phantom Morty	");
		Mortys.add(	45	,"	Double Morty	");
		Mortys.add(	46	,"	Triple Morty	");
		Mortys.add(	47	,"	Multi Morty	");
		Mortys.add(	48	,"	Greaser Morty	");
		Mortys.add(	49	,"	Biker Morty	");
		Mortys.add(	50	,"	Stray Cat Morty	");
		Mortys.add(	51	,"	Two Cat Morty	");
		Mortys.add(	52	,"	Crazy Cat Morty	");
		Mortys.add(	53	,"	Buff Morty	");
		Mortys.add(	54	,"	Wrestler Morty	");
		Mortys.add(	55	,"	Veiny Morty	");
		Mortys.add(	56	,"	No Skin Morty	");
		Mortys.add(	57	,"	Skeleton Morty	");
		Mortys.add(	58	,"	Magic Morty	");
		Mortys.add(	59	,"	Mystic Morty	");
		Mortys.add(	60	,"	Wizard Morty	");
		Mortys.add(	61	,"	Telepathic Morty	");
		Mortys.add(	62	,"	Telekinetic Morty	");
		Mortys.add(	63	,"	Psychokinetic Morty	");
		Mortys.add(	64	,"	Swimmer Morty	");
		Mortys.add(	65	,"	Mermaid Morty	");
		Mortys.add(	66	,"	Reverse Mermaid Morty	");
		Mortys.add(	67	,"	Business Morty	");
		Mortys.add(	68	,"	Gaseous Morty	");
		Mortys.add(	69	,"	Sausage Morty	");
		Mortys.add(	70	,"	Shadow Morty	");
		Mortys.add(	71	,"	Aqua Morty	");
		Mortys.add(	72	,"	Cyclops Morty	");
		Mortys.add(	73	,"	Mini Morty	");
		Mortys.add(	74	,"	Cowboy Morty	");
		Mortys.add(	75	,"	Robot Morty	");
		Mortys.add(	76	,"	Hammerhead Morty	");
		Mortys.add(	77	,"	Guard Morty	");
		Mortys.add(	78	,"	Cronenberg Morty	");
		Mortys.add(	79	,"	Mascot Morty	");
		Mortys.add(	80	,"	Egg Morty	");
		Mortys.add(	81	,"	The One True Morty	");
		Mortys.add(	82	,"	V Neck Morty	");
		Mortys.add(	83	,"	Tank Top Morty	");
		Mortys.add(	84	,"	Mullet Morty	");
		Mortys.add(	85	,"	Chops Morty	");
		Mortys.add(	86	,"	Afro Morty	");
		Mortys.add(	87	,"	Tired Morty	");
		Mortys.add(	88	,"	Sleepy Morty	");
		Mortys.add(	89	,"	Asleep Morty	");
		Mortys.add(	90	,"	Hot Morty	");
		Mortys.add(	91	,"	Flaming Morty	");
		Mortys.add(	92	,"	Cold Morty	");
		Mortys.add(	93	,"	Frozen Morty	");
		Mortys.add(	94	,"	Flu Morty	");
		Mortys.add(	95	,"	Mutant Flu Morty	");
		Mortys.add(	96	,"	Diamond Eyes Morty	");
		Mortys.add(	97	,"	Cocoon Morty	");
		Mortys.add(	98	,"	Butterfly Morty	");
		Mortys.add(	99	,"	Punk Morty	");
		Mortys.add(	100	,"	Big Tongue Morty	");
		Mortys.add(	101	,"	Pizza Morty	");
		Mortys.add(	102	,"	Mushroom Pizza Morty	");
		Mortys.add(	103	,"	Pepperoni Pizza Morty	");
		Mortys.add(	104	,"	Unicorn Chaser Morty	");
		Mortys.add(	105	,"	Unicorn Morty	");
		Mortys.add(	106	,"	Super Unicorn Morty	");
		Mortys.add(	107	,"	Moon Morty	");
		Mortys.add(	108	,"	Sun Morty	");
		Mortys.add(	109	,"	Black Hole Morty	");
		Mortys.add(	110	,"	Morticia	");
		Mortys.add(	111	,"	Single Snoozle Morty	");
		Mortys.add(	112	,"	Double Snoozle Morty	");
		Mortys.add(	113	,"	Triple Snoozle Morty	");
		Mortys.add(	114	,"	Super Morty Fan Morty	");
		Mortys.add(	115	,"	Super Rick Fan Morty	");
		Mortys.add(	116	,"	Blob Morty	");
		Mortys.add(	117	,"	Jelly Morty	");
		Mortys.add(	118	,"	Goo Morty	");
		Mortys.add(	119	,"	Infected Morty	");
		Mortys.add(	120	,"	Parasitic Morty	");
		Mortys.add(	121	,"	Host Morty	");
		Mortys.add(	122	,"	Strawberry Morty	");
		Mortys.add(	123	,"	Orange Morty	");
		Mortys.add(	124	,"	Banana Morty	");
		Mortys.add(	125	,"	Stoned Morty	");
		Mortys.add(	126	,"	Petrified Morty	");
		Mortys.add(	127	,"	Boulder Morty	");
		Mortys.add(	128	,"	Reptile Morty	");
		Mortys.add(	129	,"	Raptor Morty	");
		Mortys.add(	130	,"	Mortysaurus	");
		Mortys.add(	131	,"	Dog Bite Morty	");
		Mortys.add(	132	,"	Dog Morty	");
		Mortys.add(	133	,"	Werewolf Morty	");
		Mortys.add(	134	,"	Boot Camp Morty	");
		Mortys.add(	135	,"	Shell Shocked Morty	");
		Mortys.add(	136	,"	Renegade Morty	");
		Mortys.add(	137	,"	Headism Morty *	");
		Mortys.add(	138	,"	Turbulent Juice Morty *	");
		Mortys.add(	139	,"	Jerry Fan Morty *	");
		Mortys.add(	140	,"	Exoskeleton Morty *	");
		Mortys.add(	141	,"	Sexy Devil Morty *	");
		Mortys.add(	142	,"	Summer Morty	");
		Mortys.add(	143	,"	Jerry Morty	");
		Mortys.add(	144	,"	Beth Morty	");
		Mortys.add(	145	,"	Rick Morty	");
		Mortys.add(	146	,"	Cabin Boy Morty	");
		Mortys.add(	147	,"	Swashbuckle Morty	");
		Mortys.add(	148	,"	Cap'n Morty	");
		Mortys.add(	149	,"	Miami Morty	");
		Mortys.add(	150	,"	New Blood Morty	");
		Mortys.add(	151	,"	Count Morty	");
		Mortys.add(	152	,"	Old One Morty	");
		Mortys.add(	153	,"	Denim Shorts Morty	");
		Mortys.add(	154	,"	Double Denim Morty	");
		Mortys.add(	155	,"	Triple Denim Morty	");
		Mortys.add(	156	,"	Cup Morty	");
		Mortys.add(	157	,"	Fawn Morty	");
		Mortys.add(	158	,"	Seedling Morty	");
		Mortys.add(	159	,"	Morty of the Valley	");
		Mortys.add(	160	,"	Mortydrangea	");
		Mortys.add(	161	,"	Rookie Morty	");
		Mortys.add(	162	,"	Detective Morty	");
		Mortys.add(	163	,"	Hardboiled Morty	");
		Mortys.add(	164	,"	Poorly Cloned Morty	");
		Mortys.add(	165	,"	Kitchen Boy Morty	");
		Mortys.add(	166	,"	Pastry Chef Morty	");
		Mortys.add(	167	,"	Head Chef Morty	");
		Mortys.add(	168	,"	Skin Suit Morty	");
		Mortys.add(	169	,"	Motion Capture Morty	");
		Mortys.add(	170	,"	Rainbow Suit Morty	");
		Mortys.add(	171	,"	Loner Morty	");
		Mortys.add(	172	,"	Dangerous Morty	");
		Mortys.add(	173	,"	Violent Morty	");
		Mortys.add(	174	,"	Birdosaur Morty	");
		Mortys.add(	175	,"	Volcan Morty	");
		Mortys.add(	176	,"	Prancer Morty	");
		Mortys.add(	177	,"	Ace Pilot Morty	");
		Mortys.add(	178	,"	Survivor Morty	");
		Mortys.add(	179	,"	Survivalist Morty	");
		Mortys.add(	180	,"	Wild Man Morty	");
		Mortys.add(	181	,"	Wild Mascot Morty	");
		Mortys.add(	182	,"	Animatronic Morty	");
		Mortys.add(	183	,"	Plumbus Slave Morty	");
		Mortys.add(	184	,"	Plumbus Worker Morty	");
		Mortys.add(	185	,"	Plumbus Master Morty	");
		Mortys.add(	186	,"	Plumbus Prawn Morty	");
		Mortys.add(	187	,"	Plumbonia Morty	");
		Mortys.add(	188	,"	Armomaly Morty	");
		Mortys.add(	189	,"	Mutagen Morty	");
		Mortys.add(	190	,"	Carcinogenic Morty	");
		Mortys.add(	191	,"	Mega Morty	");
		Mortys.add(	192	,"	Spliced Morty	");
		Mortys.add(	193	,"	Crewman Morty	");
		Mortys.add(	194	,"	Ensign Morty	");
		Mortys.add(	195	,"	Lieutenant Morty	");
		Mortys.add(	196	,"	Mortaion Morty	");
		Mortys.add(	197	,"	Mortox Morty	");
		Mortys.add(	198	,"	Girl Morty	");
		Mortys.add(	199	,"	Lawyer Morty	");
		Mortys.add(	200	,"	Judge Morty	");
		Mortys.add(	201	,"	Android Morty	");
		Mortys.add(	202	,"	Giant Arm Morty	");
		Mortys.add(	203	,"	Wasteland Morty	");
		Mortys.add(	204	,"	Sunday Best Morty	");
		Mortys.add(	205	,"	Cucumber Morty	");
		Mortys.add(	206	,"	Pickle Morty	");
		Mortys.add(	207	,"	Pickled Morty	");
		Mortys.add(	208	,"	Concerto Morty	");
		Mortys.add(	209	,"	Vindicator Morty	");
		Mortys.add(	210	,"	Hawaiian Morty	");
		Mortys.add(	211	,"	Sherlock Morty	");
		Mortys.add(	212	,"	Prisoner Morty	");
		Mortys.add(	213	,"	Felon Morty	");
		Mortys.add(	214	,"	Federation Prisoner Morty	");
		Mortys.add(	215	,"	Poorhouse Morty	");
		Mortys.add(	216	,"	Chimney Sweep Morty	");
		Mortys.add(	217	,"	Master Morty	");
		Mortys.add(	218	,"	Slime Morty	");
		Mortys.add(	219	,"	Snot Morty	");
		Mortys.add(	220	,"	Gunk Morty	");
		Mortys.add(	221	,"	Detox Morty	");
		Mortys.add(	222	,"	Parade Morty	");
		Mortys.add(	223	,"	Pride Morty	");
		Mortys.add(	224	,"	Festival Morty	");
		Mortys.add(	225	,"	Big Morty	");
		Mortys.add(	226	,"	Flower Morty	");
		Mortys.add(	227	,"	Mindblower Morty	");
		Mortys.add(	228	,"	Possessed Morty	");
		Mortys.add(	229	,"	Ingested Morty	");
		Mortys.add(	230	,"	Voltamatron Morty	");
		Mortys.add(	231	,"	Space Trooper Morty	");
		Mortys.add(	232	,"	Snuffles Morty	");
		Mortys.add(	233	,"	Monster Morty	");
		Mortys.add(	234	,"	War Paint Morty	");
		Mortys.add(	235	,"	Froopy Shloop Morty	");
		Mortys.add(	236	,"	Froopy Bloop Morty	");
		Mortys.add(	237	,"	Froopy Moop Morty	");
		Mortys.add(	238	,"	Mountain Sweater Morty	");
		Mortys.add(	239	,"	Blocky Morty	");
		Mortys.add(	240	,"	Wonder Morty	");
		Mortys.add(	241	,"	Mighty Morty	");
		Mortys.add(	242	,"	The Dark Morty	");
		Mortys.add(	243	,"	Lil' Bits Morty	");
		Mortys.add(	244	,"	Season 3 Morty	");
		Mortys.add(	245	,"	Street Loco Morty	");
		Mortys.add(	246	,"	Soldado Loco Morty	");
		Mortys.add(	247	,"	Enforcer Loco Morty	");
		Mortys.add(	248	,"	Trunk Morty	");
		Mortys.add(	249	,"	Scaly Morty	");
		Mortys.add(	250	,"	Squid Face Morty	");
		Mortys.add(	251	,"	Tentacle Morty	");
		Mortys.add(	252	,"	Octo Morty	");
		Mortys.add(	253	,"	Pumpkin Morty	");
		Mortys.add(	254	,"	Scary Morty	");
		Mortys.add(	255	,"	Pre Atlantis Morty	");
		Mortys.add(	256	,"	Atlantis Morty	");
		Mortys.add(	257	,"	Post Atlantis Morty	");
		Mortys.add(	258	,"	Specs Morty	");
		Mortys.add(	259	,"	Cult of Morty Morty	");
		Mortys.add(	260	,"	Cult Leader Morty	");
		Mortys.add(	261	,"	Grand Sage Morty	");
		Mortys.add(	262	,"	Campaign Manager Morty	");
		Mortys.add(	263	,"	Left Handed Morty	");
		Mortys.add(	264	,"	Ronin Morty	");
		Mortys.add(	265	,"	Samurai Morty	");
		Mortys.add(	266	,"	Shogun Morty	");
		Mortys.add(	267	,"	Cop Morty	");
		Mortys.add(	268	,"	Stool Morty	");
		Mortys.add(	269	,"	Wooden Chair Morty	");
		Mortys.add(	270	,"	Arm Chair Morty	");
		Mortys.add(	271	,"	Turkey Morty	");
		Mortys.add(	272	,"	Pilgrim Morty	");
		Mortys.add(	273	,"	Good Time Morty	");
		Mortys.add(	274	,"	Construction Dancer Morty	");
		Mortys.add(	275	,"	Cowboy Dancer Morty	");
		Mortys.add(	276	,"	Slick Morty	");
		Mortys.add(	277	,"	Christmas Sweater Morty	");
		Mortys.add(	278	,"	Elf Morty	");
		Mortys.add(	279	,"	Santa Morty	");
		Mortys.add(	280	,"	Snowman Morty	");
		Mortys.add(	281	,"	Krampus Morty	");
		Mortys.add(	282	,"	Butt Face Morty	");
		Mortys.add(	283	,"	VR Morty	");
		Mortys.add(	284	,"	Ball Drop Morty	");
		Mortys.add(	285	,"	New Year's Morty	");
		Mortys.add(	286	,"	Grinder Morty	");
		Mortys.add(	287	,"	Friendly Morty	");
		Mortys.add(	288	,"	Hunter Morty	");
		Mortys.add(	289	,"	Box Morty	");
		Mortys.add(	290	,"	SEAL Morty	");
		Mortys.add(	291	,"	Pancake Morty	");
		Mortys.add(	292	,"	Washington Morty	");
		Mortys.add(	293	,"	Bartender Morty	");
		Mortys.add(	294	,"	Froopy Land Morty	");


		listview5.setAdapter(new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_list_item_1, Mortys));
	}


}