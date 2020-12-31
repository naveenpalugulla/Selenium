package seleniumMethods;

public enum Frame {

	INDEX{
		@Override
		public String toString()
		{
			return "index";
		}
	},
	
	ID{
		@Override
		public String toString()
		{
			return "id";
		}
	},
	
	NAME{
		@Override
		public String toString()
		{
			return "name";
		}
	}
}
