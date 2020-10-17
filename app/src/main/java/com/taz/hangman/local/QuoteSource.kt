package com.taz.hangman.local

import kotlin.random.Random.Default.nextInt


object QuoteSource {

    data class Quote(val author: String = "", val text: String)

    fun randomQuote() = QUOTE_LIST[nextInt(
        QUOTE_LIST.size)]
    private val QUOTE_LIST = listOf(
        Quote(
            "Thomas Edison",
            "Genius is one percent inspiration and ninety-nine percent perspiration."
        ),
        Quote(
            "Yogi Berra",
            "You can observe a lot just by watching."
        ),
        Quote(
            "Abraham Lincoln",
            "A house divided against itself cannot stand."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Difficulties increase the nearer we get to the goal."
        ),
        Quote(
            "Byron Pulsifer",
            "Fate is in your hands and no one elses"
        ),
        Quote(
            "Lao Tzu",
            "Be the chief but never the lord."
        ),
        Quote(
            "Carl Sandburg",
            "Nothing happens unless first we dream."
        ),
        Quote(
            "Aristotle",
            "Well begun is half done."
        ),
        Quote(
            "Yogi Berra",
            "Life is a learning experience, only if you learn."
        ),
        Quote(
            "Margaret Sangster",
            "Self-complacency is fatal to progress."
        ),
        Quote(
            "Buddha",
            "Peace comes from within. Do not seek it without."
        ),
        Quote(
            "Byron Pulsifer",
            "What you give is what you get."
        ),
        Quote(
            "Iris Murdoch",
            "We can only learn to love by loving."
        ),
        Quote(
            "Karen Clark",
            "Life is change. Growth is optional. Choose wisely."
        ),
        Quote(
            "Wayne Dyer",
            "You'll see it when you believe it."
        ),
        Quote(
            "nan",
            "Today is the tomorrow we worried about yesterday."
        ),
        Quote(
            "nan",
            "It's easier to see the mistakes on someone else's paper."
        ),
        Quote(
            "nan",
            "Every man dies. Not every man really lives."
        ),
        Quote(
            "Lao Tzu",
            "To lead people walk behind them."
        ),
        Quote(
            "William Shakespeare",
            "Having nothing, nothing can he lose."
        ),
        Quote(
            "Henry J. Kaiser",
            "Trouble is only opportunity in work clothes."
        ),
        Quote(
            "Publilius Syrus",
            "A rolling stone gathers no moss."
        ),
        Quote(
            "Napoleon Hill",
            "Ideas are the beginning points of all fortunes."
        ),
        Quote(
            "Donald Trump",
            "Everything in life is luck."
        ),
        Quote(
            "Lao Tzu",
            "Doing nothing is better than being busy doing nothing."
        ),
        Quote(
            "Benjamin Spock",
            "Trust yourself. You know more than you think you do."
        ),
        Quote(
            "Confucius",
            "Study the past, if you would divine the future."
        ),
        Quote(
            "nan",
            "The day is already blessed, find peace within it."
        ),
        Quote(
            "Sigmund Freud",
            "From error to error one discovers the entire truth."
        ),
        Quote(
            "Benjamin Franklin",
            "Well done is better than well said."
        ),
        Quote(
            "Ella Williams",
            "Bite off more than you can chew, then chew it."
        ),
        Quote(
            "Buddha",
            "Work out your own salvation. Do not depend on others."
        ),
        Quote(
            "Benjamin Franklin",
            "One today is worth two tomorrows."
        ),
        Quote(
            "Christopher Reeve",
            "Once you choose hope, anythings possible."
        ),
        Quote(
            "Albert Einstein",
            "God always takes the simplest way."
        ),
        Quote(
            "Charles Kettering",
            "One fails forward toward success."
        ),
        Quote(
            "nan",
            "From small beginnings come great things."
        ),
        Quote(
            "Chinese proverb",
            "Learning is a treasure that will follow its owner everywhere"
        ),
        Quote(
            "Socrates",
            "Be as you wish to seem."
        ),
        Quote(
            "V. Naipaul",
            "The world is always in movement."
        ),
        Quote(
            "John Wooden",
            "Never mistake activity for achievement."
        ),
        Quote(
            "Haddon Robinson",
            "What worries you masters you."
        ),
        Quote(
            "Pearl Buck",
            "One faces the future with ones past."
        ),
        Quote(
            "Brian Tracy",
            "Goals are the fuel in the furnace of achievement."
        ),
        Quote(
            "Leonardo da Vinci",
            "Who sows virtue reaps honour."
        ),
        Quote(
            "Dalai Lama",
            "Be kind whenever possible. It is always possible."
        ),
        Quote(
            "Chinese proverb",
            "Talk doesn't cook rice."
        ),
        Quote(
            "Buddha",
            "He is able who thinks he is able."
        ),
        Quote(
            "Larry Elder",
            "A goal without a plan is just a wish."
        ),
        Quote(
            "Michael Korda",
            "To succeed, we must first believe that we can."
        ),
        Quote(
            "Albert Einstein",
            "Learn from yesterday, live for today, hope for tomorrow."
        ),
        Quote(
            "James Lowell",
            "A weed is no more than a flower in disguise."
        ),
        Quote(
            "Yoda",
            "Do, or do not. There is no try."
        ),
        Quote(
            "Harriet Beecher Stowe",
            "All serious daring starts from within."
        ),
        Quote(
            "Byron Pulsifer",
            "The best teacher is experience learned from failures."
        ),
        Quote(
            "Murray Gell-Mann",
            "Think how hard physics would be if particles could think."
        ),
        Quote(
            "John Lennon",
            "Love is the flower you've got to let grow."
        ),
        Quote(
            "Napoleon Hill",
            "Don't wait. The time will never be just right."
        ),
        Quote(
            "Pericles",
            "Time is the wisest counsellor of all."
        ),
        Quote(
            "Napoleon Hill",
            "You give before you get."
        ),
        Quote(
            "Socrates",
            "Wisdom begins in wonder."
        ),
        Quote(
            "Baltasar Gracian",
            "Without courage, wisdom bears no fruit."
        ),
        Quote(
            "Aristotle",
            "Change in all things is sweet."
        ),
        Quote(
            "Byron Pulsifer",
            "What you fear is that which requires action to overcome."
        ),
        Quote(
            "Cullen Hightower",
            "When performance exceeds ambition, the overlap is called success."
        ),
        Quote(
            "African proverb",
            "When deeds speak, words are nothing."
        ),
        Quote(
            "Wayne Dyer",
            "Real magic in relationships means an absence of judgement of others."
        ),
        Quote(
            "Albert Einstein",
            "I never think of the future. It comes soon enough."
        ),
        Quote(
            "Ralph Emerson",
            "Skill to do comes of doing."
        ),
        Quote(
            "Sophocles",
            "Wisdom is the supreme part of happiness."
        ),
        Quote(
            "Maya Angelou",
            "I believe that every person is born with talent."
        ),
        Quote(
            "Abraham Lincoln",
            "Important principles may, and must, be inflexible."
        ),
        Quote(
            "Richard Evans",
            "The undertaking of a new action brings new strength."
        ),
        Quote(
            "Ralph Emerson",
            "The years teach much which the days never know."
        ),
        Quote(
            "Ralph Emerson",
            "Our distrust is very expensive."
        ),
        Quote(
            "Bodhidharma",
            "All know the way; few actually walk it."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Great talent finds happiness in execution."
        ),
        Quote(
            "Michelangelo",
            "Faith in oneself is the best and safest course."
        ),
        Quote(
            "Winston Churchill",
            "Courage is going from failure to failure without losing enthusiasm."
        ),
        Quote(
            "Leo Tolstoy",
            "The two most powerful warriors are patience and time."
        ),
        Quote(
            "Lao Tzu",
            "Anticipate the difficult by managing the easy."
        ),
        Quote(
            "Buddha",
            "Those who are free of resentful thoughts surely find peace."
        ),
        Quote(
            "Sophocles",
            "A short saying often contains much wisdom."
        ),
        Quote(
            "nan",
            "It takes both sunshine and rain to make a rainbow."
        ),
        Quote(
            "nan",
            "A beautiful thing is never perfect."
        ),
        Quote(
            "Princess Diana",
            "Only do what your heart tells you."
        ),
        Quote(
            "John Pierrakos",
            "Life is movement-we breathe, we eat, we walk, we move!"
        ),
        Quote(
            "Eleanor Roosevelt",
            "No one can make you feel inferior without your consent."
        ),
        Quote(
            "Richard Bach",
            "Argue for your limitations, and sure enough theyre yours."
        ),
        Quote(
            "Seneca",
            "Luck is what happens when preparation meets opportunity."
        ),
        Quote(
            "Napoleon Bonaparte",
            "Victory belongs to the most persevering."
        ),
        Quote(
            "William Shakespeare",
            "Love all, trust a few, do wrong to none."
        ),
        Quote(
            "Richard Bach",
            "In order to win, you must expect to win."
        ),
        Quote(
            "Napoleon Hill",
            "A goal is a dream with a deadline."
        ),
        Quote(
            "Napoleon Hill",
            "You can do it if you believe you can!"
        ),
        Quote(
            "Bo Jackson",
            "Set your goals high, and don't stop till you get there."
        ),
        Quote(
            "nan",
            "Every new day is another chance to change your life."
        ),
        Quote(
            "Thich Nhat Hanh",
            "Smile, breathe, and go slowly."
        ),
        Quote(
            "Liberace",
            "Nobody will believe in you unless you believe in yourself."
        ),
        Quote(
            "William Arthur Ward",
            "Do more than dream: work."
        ),
        Quote(
            "Seneca",
            "No man was ever wise by chance."
        ),
        Quote(
            "nan",
            "Some pursue happiness, others create it."
        ),
        Quote(
            "William Shakespeare",
            "He that is giddy thinks the world turns round."
        ),
        Quote(
            "Ellen Gilchrist",
            "Don't ruin the present with the ruined past."
        ),
        Quote(
            "Albert Schweitzer",
            "Do something wonderful, people may imitate it."
        ),
        Quote(
            "nan",
            "We do what we do because we believe."
        ),
        Quote(
            "Eleanor Roosevelt",
            "Do one thing every day that scares you."
        ),
        Quote(
            "Byron Pulsifer",
            "If you cannot be silent be brilliant and thoughtful."
        ),
        Quote(
            "Carl Jung",
            "Who looks outside, dreams; who looks inside, awakes."
        ),
        Quote(
            "Buddha",
            "What we think, we become."
        ),
        Quote(
            "Lord Herbert",
            "The shortest answer is doing."
        ),
        Quote(
            "Leonardo da Vinci",
            "All our knowledge has its origins in our perceptions."
        ),
        Quote(
            "nan",
            "The harder you fall, the higher you bounce."
        ),
        Quote(
            "Anne Wilson Schaef",
            "Trusting our intuition often saves us from disaster."
        ),
        Quote(
            "Sojourner Truth",
            "Truth is powerful and it prevails."
        ),
        Quote(
            "Elizabeth Browning",
            "Light tomorrow with today!"
        ),
        Quote(
            "German proverb",
            "Silence is a fence around wisdom."
        ),
        Quote(
            "Madame de Stael",
            "Society develops wit, but its contemplation alone forms genius."
        ),
        Quote(
            "Richard Bach",
            "The simplest things are often the truest."
        ),
        Quote(
            "nan",
            "Everyone smiles in the same language."
        ),
        Quote(
            "Bernadette Devlin",
            "Yesterday I dared to struggle. Today I dare to win."
        ),
        Quote(
            "Napoleon Hill",
            "No alibi will save you from accepting the responsibility."
        ),
        Quote(
            "Walt Disney",
            "If you can dream it, you can do it."
        ),
        Quote(
            "Buddha",
            "It is better to travel well than to arrive."
        ),
        Quote(
            "Anais Nin",
            "Life shrinks or expands in proportion to one's courage."
        ),
        Quote(
            "Sun Tzu",
            "You have to believe in yourself."
        ),
        Quote(
            "Wayne Dyer",
            "Our intention creates our reality."
        ),
        Quote(
            "Confucius",
            "Silence is a true friend who never betrays."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Character develops itself in the stream of life."
        ),
        Quote(
            "American proverb",
            "From little acorns mighty oaks do grow."
        ),
        Quote(
            "Jon Kabat-Zinn",
            "You can't stop the waves, but you can learn to surf."
        ),
        Quote(
            "Gustave Flaubert",
            "Reality does not conform to the ideal, but confirms it."
        ),
        Quote(
            "William Shakespeare",
            "Speak low, if you speak love."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "A really great talent finds its happiness in execution."
        ),
        Quote(
            "John Lennon",
            "Reality leaves a lot to the imagination."
        ),
        Quote(
            "Seneca",
            "The greatest remedy for anger is delay."
        ),
        Quote(
            "Pearl Buck",
            "Growth itself contains the germ of happiness."
        ),
        Quote(
            "nan",
            "You can do what's reasonable or you can decide what's possible."
        ),
        Quote(
            "Leonardo da Vinci",
            "Nothing strengthens authority so much as silence."
        ),
        Quote(
            "Confucius",
            "Wherever you go, go with all your heart."
        ),
        Quote(
            "Albert Einstein",
            "The only real valuable thing is intuition."
        ),
        Quote(
            "Ralph Emerson",
            "Good luck is another name for tenacity of purpose."
        ),
        Quote(
            "Sylvia Voirol",
            "Rainbows apologize for angry skies."
        ),
        Quote(
            "nan",
            "Friendship isn't a big thing. It's a million little things."
        ),
        Quote(
            "Theophrastus",
            "Time is the most valuable thing a man can spend."
        ),
        Quote(
            "Tony Robbins",
            "Whatever happens, take responsibility."
        ),
        Quote(
            "Oscar Wilde",
            "Experience is simply the name we give our mistakes."
        ),
        Quote(
            "Wayne Dyer",
            "I think and that is all that I am."
        ),
        Quote(
            "nan",
            "A good plan today is better than a perfect plan tomorrow."
        ),
        Quote(
            "Gloria Steinem",
            "If the shoe doesn't fit, must we change the foot?"
        ),
        Quote(
            "Marcus Aurelius",
            "Each day provides its own gifts."
        ),
        Quote(
            "Publilius Syrus",
            "While we stop to think, we often miss our opportunity."
        ),
        Quote(
            "Bernard Shaw",
            "Life isn't about finding yourself. Life is about creating yourself."
        ),
        Quote(
            "Richard Bach",
            "To bring anything into your life, imagine that it's already there."
        ),
        Quote(
            "German proverb",
            "Begin to weave and God will give you the thread."
        ),
        Quote(
            "Confucius",
            "The more you know yourself, the more you forgive yourself."
        ),
        Quote(
            "nan",
            "Someone remembers, someone cares; your name is whispered in someone's prayers."
        ),
        Quote(
            "Mary Bethune",
            "Without faith, nothing is possible. With it, nothing is impossible."
        ),
        Quote(
            "Albert Einstein",
            "Once we accept our limits, we go beyond them."
        ),
        Quote(
            "nan",
            "Don't be pushed by your problems; be led by your dreams."
        ),
        Quote(
            "Brian Tracy",
            "Whatever we expect with confidence becomes our own self-fulfilling prophecy."
        ),
        Quote(
            "Pablo Picasso",
            "Everything you can imagine is real."
        ),
        Quote(
            "Usman Asif",
            "Fear is a darkroom where negatives develop."
        ),
        Quote(
            "Napoleon Bonaparte",
            "The truest wisdom is a resolute determination."
        ),
        Quote(
            "Victor Hugo",
            "Life is the flower for which love is the honey."
        ),
        Quote(
            "Epictetus",
            "Freedom is the right to live as we wish."
        ),
        Quote(
            "nan",
            "Change your thoughts, change your life!"
        ),
        Quote(
            "Robert Heller",
            "Never ignore a gut feeling, but never believe that it's enough."
        ),
        Quote(
            "Marcus Aurelius",
            "Loss is nothing else but change,and change is Natures delight."
        ),
        Quote(
            "Byron Pulsifer",
            "Someone is special only if you tell them."
        ),
        Quote(
            "nan",
            "Today is the tomorrow you worried about yesterday."
        ),
        Quote(
            "Thich Nhat Hanh",
            "There is no way to happiness, happiness is the way."
        ),
        Quote(
            "nan",
            "The day always looks brighter from behind a smile."
        ),
        Quote(
            "nan",
            "A stumble may prevent a fall."
        ),
        Quote(
            "Lao Tzu",
            "He who talks more is sooner exhausted."
        ),
        Quote(
            "Lao Tzu",
            "He who is contented is rich."
        ),
        Quote(
            "Plutarch",
            "What we achieve inwardly will change outer reality."
        ),
        Quote(
            "Ralph Waldo Emerson",
            "Our strength grows out of our weaknesses."
        ),
        Quote(
            "Mahatma Gandhi",
            "We must become the change we want to see."
        ),
        Quote(
            "Napoleon Hill",
            "Happiness is found in doing, not merely possessing."
        ),
        Quote(
            "nan",
            "Put your future in good hands : your own."
        ),
        Quote(
            "Wit",
            "We choose our destiny in the way we treat others."
        ),
        Quote(
            "Voltaire",
            "No snowflake in an avalanche ever feels responsible."
        ),
        Quote(
            "Virgil",
            "Fortune favours the brave."
        ),
        Quote(
            "Joseph Stalin",
            "I believe in one thing only, the power of human will."
        ),
        Quote(
            "Robert Frost",
            "The best way out is always through."
        ),
        Quote(
            "Seneca",
            "The mind unlearns with difficulty what it has long learned."
        ),
        Quote(
            "Abraham Lincoln",
            "I destroy my enemies when I make them my friends."
        ),
        Quote(
            "Thomas Fuller",
            "No garden is without its weeds."
        ),
        Quote(
            "Elbert Hubbard",
            "There is no failure except in no longer trying."
        ),
        Quote(
            "Turkish proverb",
            "Kind words will unlock an iron door."
        ),
        Quote(
            "Hugh Miller",
            "Problems are only opportunities with thorns on them."
        ),
        Quote(
            "A. Powell Davies",
            "Life is just a chance to grow a soul."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Mountains cannot be surmounted except by winding paths."
        ),
        Quote(
            "Thich Nhat Hanh",
            "May our hearts garden of awakening bloom with hundreds of flowers."
        ),
        Quote(
            "John Dryden",
            "Fortune befriends the bold."
        ),
        Quote(
            "Friedrich von Schiller",
            "Keep true to the dreams of thy youth."
        ),
        Quote(
            "Mike Ditka",
            "You're never a loser until you quit trying."
        ),
        Quote(
            "Immanuel Kant",
            "Science is organized knowledge. Wisdom is organized life."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Knowing is not enough; we must apply!"
        ),
        Quote(
            "Richard Bach",
            "Strong beliefs win strong men, and then make them stronger."
        ),
        Quote(
            "Albert Camus",
            "Autumn is a second spring when every leaf is a flower."
        ),
        Quote(
            "Toni Morrison",
            "If you surrender to the wind, you can ride it."
        ),
        Quote(
            "Helen Keller",
            "Keep yourself to the sunshine and you cannot see the shadow."
        ),
        Quote(
            "Paulo Coelho",
            "Write your plans in pencil and give God the eraser."
        ),
        Quote(
            "Pablo Picasso",
            "Inspiration exists, but it has to find us working."
        ),
        Quote(
            "Jonathan Kozol",
            "Pick battles big enough to matter, small enough to win."
        ),
        Quote(
            "Janis Joplin",
            "Don't compromise yourself. You are all you've got."
        ),
        Quote(
            "Sophocles",
            "A short saying oft contains much wisdom."
        ),
        Quote(
            "Epictetus",
            "Difficulties are things that show a person what they are."
        ),
        Quote(
            "Honore de Balzac",
            "When you doubt your power, you give power to your doubt."
        ),
        Quote(
            "Ovid",
            "The cause is hidden. The effect is visible to all."
        ),
        Quote(
            "Francis Bacon",
            "A prudent question is one half of wisdom."
        ),
        Quote(
            "Tony Robbins",
            "The path to success is to take massive, determined action."
        ),
        Quote(
            "Manuel Puig",
            "I allow my intuition to lead my path."
        ),
        Quote(
            "William R. Inge",
            "Nature takes away any faculty that is not used."
        ),
        Quote(
            "Epictetus",
            "If you wish to be a writer, write."
        ),
        Quote(
            "Wayne Dyer",
            "There is no way to prosperity, prosperity is the way."
        ),
        Quote(
            "Jim Rohn",
            "Either you run the day or the day runs you."
        ),
        Quote(
            "Publilius Syrus",
            "Better be ignorant of a matter than half know it."
        ),
        Quote(
            "Oprah Winfrey",
            "Follow your instincts. That is where true wisdom manifests itself."
        ),
        Quote(
            "Benjamin Franklin",
            "There never was a good knife made of bad steel."
        ),
        Quote(
            "Anatole France",
            "To accomplish great things, we must dream as well as act."
        ),
        Quote(
            "Saint Augustine",
            "Patience is the companion of wisdom."
        ),
        Quote(
            "Buddha",
            "The mind is everything. What you think you become."
        ),
        Quote(
            "Voltaire",
            "To enjoy life, we must touch much of it lightly."
        ),
        Quote(
            "Maya Lin",
            "To fly, we have to have resistance."
        ),
        Quote(
            "nan",
            "What you see depends on what you're looking for."
        ),
        Quote(
            "Blaise Pascal",
            "The heart has its reasons which reason knows not of."
        ),
        Quote(
            "William Shakespeare",
            "Be great in act, as you have been in thought."
        ),
        Quote(
            "Napoleon Bonaparte",
            "Imagination rules the world."
        ),
        Quote(
            "Blaise Pascal",
            "Kind words do not cost much. Yet they accomplish much."
        ),
        Quote(
            "Michelangelo",
            "There is no greater harm than that of time wasted."
        ),
        Quote(
            "Jonas Salk",
            "Intuition will tell the thinking mind where to look next."
        ),
        Quote(
            "nan",
            "Worry gives a small thing a big shadow."
        ),
        Quote(
            "Napoleon Hill",
            "Fears are nothing more than a state of mind."
        ),
        Quote(
            "Lao Tzu",
            "The journey of a thousand miles begins with one step."
        ),
        Quote(
            "Peter Drucker",
            "Efficiency is doing things right; effectiveness is doing the right things."
        ),
        Quote(
            "Luisa Sigea",
            "Blaze with the fire that is never extinguished."
        ),
        Quote(
            "Dr. Seuss",
            "Don't cry because it's over. Smile because it happened."
        ),
        Quote(
            "Jason Fried",
            "No is easier to do. Yes is easier to say."
        ),
        Quote(
            "Confucius",
            "To be wrong is nothing unless you continue to remember it."
        ),
        Quote(
            "Babe Ruth",
            "Yesterdays home runs don't win today's games."
        ),
        Quote(
            "Carlyle",
            "Silence is deep as Eternity, Speech is shallow as Time."
        ),
        Quote(
            "Leo F. Buscaglia",
            "Don't smother each other. No one can grow in the shade."
        ),
        Quote(
            "Lao Tzu",
            "An ant on the move does more than a dozing ox"
        ),
        Quote(
            "Indira Gandhi",
            "You can't shake hands with a clenched fist."
        ),
        Quote(
            "Plato",
            "A good decision is based on knowledge and not on numbers."
        ),
        Quote(
            "Confucius",
            "The cautious seldom err."
        ),
        Quote(
            "Frederick Douglass",
            "If there is no struggle, there is no progress."
        ),
        Quote(
            "Willa Cather",
            "Where there is great love, there are always miracles."
        ),
        Quote(
            "John Lennon",
            "Time you enjoy wasting, was not wasted."
        ),
        Quote(
            "Richard Bach",
            "Every problem has a gift for you in its hands."
        ),
        Quote(
            "Jean de la Fontaine",
            "Sadness flies away on the wings of time."
        ),
        Quote(
            "Publilius Syrus",
            "I have often regretted my speech, never my silence."
        ),
        Quote(
            "Thomas Jefferson",
            "Never put off till tomorrow what you can do today."
        ),
        Quote(
            "Thomas Dewar",
            "Minds are like parachutes. They only function when open."
        ),
        Quote(
            "George Patton",
            "If a man does his best, what else is there?"
        ),
        Quote(
            "Benjamin Disraeli",
            "The secret of success is constancy to purpose."
        ),
        Quote(
            "Ralph Emerson",
            "Life is a progress, and not a station."
        ),
        Quote(
            "Horace Friess",
            "All seasons are beautiful for the person who carries happiness within."
        ),
        Quote(
            "Elbert Hubbard",
            "To avoid criticism, do nothing, say nothing, be nothing."
        ),
        Quote(
            "Ovid",
            "All things change; nothing perishes."
        ),
        Quote(
            "Haynes Bayly",
            "Absence makes the heart grow fonder."
        ),
        Quote(
            "Lauren Bacall",
            "Imagination is the highest kite one can fly."
        ),
        Quote(
            "Frank Herbert",
            "The beginning of knowledge is the discovery of something we do not understand."
        ),
        Quote(
            "Elizabeth Browning",
            "Love doesn't make the world go round, love is what makes the ride worthwhile."
        ),
        Quote(
            "Arthur Conan Doyle",
            "Whenever you have eliminated the impossible, whatever remains, however improbable, must be the truth."
        ),
        Quote(
            "J. Willard Marriott",
            "Good timber does not grow with ease; the stronger the wind, the stronger the trees."
        ),
        Quote(
            "Dalai Lama",
            "I believe that we are fundamentally the same and have the same basic potential."
        ),
        Quote(
            "Edward Gibbon",
            "The winds and waves are always on the side of the ablest navigators."
        ),
        Quote(
            "Eleanor Roosevelt",
            "The future belongs to those who believe in the beauty of their dreams."
        ),
        Quote(
            "nan",
            "To get something you never had, you have to do something you never did."
        ),
        Quote(
            "nan",
            "Be thankful when you don't know something for it gives you the opportunity to learn."
        ),
        Quote(
            "Mahatma Gandhi",
            "Strength does not come from physical capacity. It comes from an indomitable will."
        ),
        Quote(
            "Og Mandino",
            "Each misfortune you encounter will carry in it the seed of tomorrows good luck."
        ),
        Quote(
            "Lewis B. Smedes",
            "To forgive is to set a prisoner free and realize that prisoner was you."
        ),
        Quote(
            "Buddha",
            "In separateness lies the world's great misery, in compassion lies the world's true strength."
        ),
        Quote(
            "Nikos Kazantzakis",
            "By believing passionately in something that does not yet exist, we create it."
        ),
        Quote(
            "nan",
            "Letting go isn't the end of the world; it's the beginning of a new life."
        ),
        Quote(
            "John Eliot",
            "All the great performers I have worked with are fuelled by a personal dream."
        ),
        Quote(
            "A. A. Milne",
            "One of the advantages of being disorderly is that one is constantly making exciting discoveries."
        ),
        Quote(
            "Marie Curie",
            "I never see what has been done; I only see what remains to be done."
        ),
        Quote(
            "Seneca",
            "Begin at once to live and count each separate day as a separate life."
        ),
        Quote(
            "Lawrence Peter",
            "If you don't know where you are going, you will probably end up somewhere else."
        ),
        Quote(
            "Hannah More",
            "It is not so important to know everything as to appreciate what we learn."
        ),
        Quote(
            "John Berry",
            "The bird of paradise alights only upon the hand that does not grasp."
        ),
        Quote(
            "William Yeats",
            "Think as a wise man but communicate in the language of the people."
        ),
        Quote(
            "Epictetus",
            "Practice yourself, for heavens sake in little things, and then proceed to greater."
        ),
        Quote(
            "Seneca",
            "If one does not know to which port is sailing, no wind is favorable."
        ),
        Quote(
            "nan",
            "Our greatest glory is not in never failing but rising everytime we fall."
        ),
        Quote(
            "nan",
            "Being right is highly overrated. Even a stopped clock is right twice a day."
        ),
        Quote(
            "Ken S. Keyes",
            "To be upset over what you don't have is to waste what you do have."
        ),
        Quote(
            "Thomas Edison",
            "If we did the things we are capable of, we would astound ourselves."
        ),
        Quote(
            "Marie Curie",
            "Nothing in life is to be feared. It is only to be understood."
        ),
        Quote(
            "Tony Robbins",
            "Successful people ask better questions, and as a result, they get better answers."
        ),
        Quote(
            "nan",
            "Love is not blind; it simply enables one to see things others fail to see."
        ),
        Quote(
            "Anne Schaef",
            "Life is a process. We are a process. The universe is a process."
        ),
        Quote(
            "Eleanor Roosevelt",
            "I think somehow we learn who we really are and then live with that decision."
        ),
        Quote(
            "Kenneth Patton",
            "We learn what we have said from those who listen to our speaking."
        ),
        Quote(
            "Kahlil Gibran",
            "A little knowledge that acts is worth infinitely more than much knowledge that is idle."
        ),
        Quote(
            "nan",
            "If you get up one more time than you fall, you will make it through."
        ),
        Quote(
            "Flora Whittemore",
            "The doors we open and close each day decide the lives we live."
        ),
        Quote(
            "H. W. Arnold",
            "The worst bankrupt in the world is the person who has lost his enthusiasm."
        ),
        Quote(
            "Buddha",
            "Happiness comes when your work and words are of benefit to yourself and others."
        ),
        Quote(
            "nan",
            "Don't focus on making the right decision, focus on making the decision the right one."
        ),
        Quote(
            "Wayne Dyer",
            "Everything is perfect in the universe, even your desire to improve it."
        ),
        Quote(
            "Eden Phillpotts",
            "The universe is full of magical things, patiently waiting for our wits to grow sharper."
        ),
        Quote(
            "Buddha",
            "Just as a candle cannot burn without fire, men cannot live without a spiritual life."
        ),
        Quote(
            "Mark Twain",
            "A thing long expected takes the form of the unexpected when at last it comes."
        ),
        Quote(
            "Benjamin Disraeli",
            "Action may not always bring happiness; but there is no happiness without action."
        ),
        Quote(
            "Oprah Winfrey",
            "I don't believe in failure. It is not failure if you enjoyed the process."
        ),
        Quote(
            "Confucius",
            "What you do not want done to yourself, do not do to others."
        ),
        Quote(
            "Winston Churchill",
            "Short words are best and the old words when short are best of all."
        ),
        Quote(
            "Buddha",
            "If you light a lamp for somebody, it will also brighten your path."
        ),
        Quote(
            "Lin-yutang",
            "I have done my best: that is about all the philosophy of living one needs."
        ),
        Quote(
            "Benjamin Disraeli",
            "Through perseverance many people win success out of what seemed destined to be certain failure."
        ),
        Quote(
            "Byron Pulsifer",
            "Give thanks for the rain of life that propels us to reach new horizons."
        ),
        Quote(
            "nan",
            "Love is just a word until someone comes along and gives it meaning."
        ),
        Quote(
            "nan",
            "We all have problems. The way we solve them is what makes us different."
        ),
        Quote(
            "Dave Weinbaum",
            "The secret to a rich life is to have more beginnings than endings."
        ),
        Quote(
            "Ralph Waldo Emerson",
            "It is only when the mind and character slumber that the dress can be seen."
        ),
        Quote(
            "Maya Angelou",
            "If you don't like something, change it. If you can't change it, change your attitude."
        ),
        Quote(
            "Confucius",
            "Reviewing what you have learned and learning anew, you are fit to be a teacher."
        ),
        Quote(
            "Augustinus Sanctus",
            "The world is a book, and those who do not travel read only a page."
        ),
        Quote(
            "Henri-Frederic Amiel",
            "So long as a person is capable of self-renewal they are a living being."
        ),
        Quote(
            "Louisa Alcott",
            "I'm not afraid of storms, for Im learning how to sail my ship."
        ),
        Quote(
            "Voltaire",
            "Think for yourselves and let others enjoy the privilege to do so too."
        ),
        Quote(
            "Annie Dillard",
            "How we spend our days is, of course, how we spend our lives."
        ),
        Quote(
            "Man Ray",
            "It has never been my object to record my dreams, just to realize them."
        ),
        Quote(
            "Sigmund Freud",
            "The most complicated achievements of thought are possible without the assistance of consciousness."
        ),
        Quote(
            "Wayne Dyer",
            "Be miserable. Or motivate yourself. Whatever has to be done, it's always your choice."
        ),
        Quote(
            "Napoleon Hill",
            "Most great people have attained their greatest success just one step beyond their greatest failure."
        ),
        Quote(
            "Henry Ford",
            "If you think you can, you can. And if you think you can't, you're right."
        ),
        Quote(
            "St. Augustine",
            "Better to have loved and lost, than to have never loved at all."
        ),
        Quote(
            "Leo Tolstoy",
            "Everyone thinks of changing the world, but no one thinks of changing himself."
        ),
        Quote(
            "Richard Bach",
            "The best way to pay for a lovely moment is to enjoy it."
        ),
        Quote(
            "Winston Churchill",
            "You have enemies? Good. That means you've stood up for something, sometime in your life."
        ),
        Quote(
            "John De Paola",
            "Slow down and everything you are chasing will come around and catch you."
        ),
        Quote(
            "Buddha",
            "Your worst enemy cannot harm you as much as your own unguarded thoughts."
        ),
        Quote(
            "Lily Tomlin",
            "I always wanted to be somebody, but I should have been more specific."
        ),
        Quote(
            "John Lennon",
            "Yeah we all shine on, like the moon, and the stars, and the sun."
        ),
        Quote(
            "Martin Fischer",
            "Knowledge is a process of piling up facts; wisdom lies in their simplification."
        ),
        Quote(
            "Albert Einstein",
            "Life is like riding a bicycle. To keep your balance you must keep moving."
        ),
        Quote(
            "Albert Schweitzer",
            "We should all be thankful for those people who rekindle the inner spirit."
        ),
        Quote(
            "Thomas Edison",
            "Opportunity is missed by most because it is dressed in overalls and looks like work."
        ),
        Quote(
            "Albert Einstein",
            "Feeling and longing are the motive forces behind all human endeavor and human creations."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "In the end we retain from our studies only that which we practically apply."
        ),
        Quote(
            "Lao Tzu",
            "If you correct your mind, the rest of your life will fall into place."
        ),
        Quote(
            "Ralph Emerson",
            "The world makes way for the man who knows where he is going."
        ),
        Quote(
            "Napoleon Hill",
            "When your desires are strong enough you will appear to possess superhuman powers to achieve."
        ),
        Quote(
            "John Adams",
            "Patience and perseverance have a magical effect before which difficulties disappear and obstacles vanish."
        ),
        Quote(
            "Henry David Thoreau",
            "I cannot make my days longer so I strive to make them better."
        ),
        Quote(
            "Chinese proverb",
            "Tension is who you think you should be. Relaxation is who you are."
        ),
        Quote(
            "Helen Keller",
            "Never bend your head. Always hold it high. Look the world right in the eye."
        ),
        Quote(
            "Albert Schweitzer",
            "One who gains strength by overcoming obstacles possesses the only strength which can overcome adversity."
        ),
        Quote(
            "Calvin Coolidge",
            "We cannot do everything at once, but we can do something at once."
        ),
        Quote(
            "Abraham Lincoln",
            "You have to do your own growing no matter how tall your grandfather was."
        ),
        Quote(
            "nan",
            "Invent your world. Surround yourself with people, color, sounds, and work that nourish you."
        ),
        Quote(
            "General Douglas MacArthur",
            "It is fatal to enter any war without the will to win it."
        ),
        Quote(
            "Julius Charles Hare",
            "Be what you are. This is the first step toward becoming better than you are."
        ),
        Quote(
            "Buckminster Fuller",
            "There is nothing in a caterpillar that tells you it's going to be a butterfly."
        ),
        Quote(
            "Dalai Lama",
            "Love and compassion open our own inner life, reducing stress, distrust and loneliness."
        ),
        Quote(
            "Walter Lippmann",
            "Ideals are an imaginative understanding of that which is desirable in that which is possible."
        ),
        Quote(
            "Confucius",
            "The superior man is satisfied and composed; the mean man is always full of distress."
        ),
        Quote(
            "Bruce Lee",
            "If you spend too much time thinking about a thing, you'll never get it done."
        ),
        Quote(
            "Buddha",
            "The way is not in the sky. The way is in the heart."
        ),
        Quote(
            "Abraham Lincoln",
            "Most people are about as happy as they make up their minds to be"
        ),
        Quote(
            "Buddha",
            "Three things cannot be long hidden: the sun, the moon, and the truth."
        ),
        Quote(
            "Dalai Lama",
            "More often than not, anger is actually an indication of weakness rather than of strength."
        ),
        Quote(
            "Jim Beggs",
            "Before you put on a frown, make absolutely sure there are no smiles available."
        ),
        Quote(
            "Donald Kircher",
            "A man of ability and the desire to accomplish something can do anything."
        ),
        Quote(
            "Buddha",
            "You, yourself, as much as anybody in the entire universe, deserve your love and affection."
        ),
        Quote(
            "Eckhart Tolle",
            "It is not uncommon for people to spend their whole life waiting to start living."
        ),
        Quote(
            "H. Jackson Browne",
            "Don't be afraid to go out on a limb. That's where the fruit is."
        ),
        Quote(
            "Marquis Vauvenargues",
            "Wicked people are always surprised to find ability in those that are good."
        ),
        Quote(
            "Charlotte Bronte",
            "Life is so constructed that an event does not, cannot, will not, match the expectation."
        ),
        Quote(
            "Wayne Dyer",
            "If you change the way you look at things, the things you look at change."
        ),
        Quote(
            "Napoleon Hill",
            "No man can succeed in a line of endeavor which he does not like."
        ),
        Quote(
            "Buddha",
            "You will not be punished for your anger, you will be punished by your anger."
        ),
        Quote(
            "Robert Stevenson",
            "Don't judge each day by the harvest you reap but by the seeds you plant."
        ),
        Quote(
            "Andy Warhol",
            "They say that time changes things, but you actually have to change them yourself."
        ),
        Quote(
            "Benjamin Disraeli",
            "Never apologize for showing feelings. When you do so, you apologize for the truth."
        ),
        Quote(
            "Pema Chodron",
            "The truth you believe and cling to makes you unavailable to hear anything new."
        ),
        Quote(
            "Horace",
            "Adversity has the effect of eliciting talents, which in prosperous circumstances would have lain dormant."
        ),
        Quote(
            "Morris West",
            "If you spend your whole life waiting for the storm, you'll never enjoy the sunshine."
        ),
        Quote(
            "Franklin Roosevelt",
            "The only limit to our realization of tomorrow will be our doubts of today."
        ),
        Quote(
            "Edwin Chapin",
            "Every action of our lives touches on some chord that will vibrate in eternity."
        ),
        Quote(
            "Les Brown",
            "Shoot for the moon. Even if you miss, you'll land among the stars."
        ),
        Quote(
            "Confucius",
            "It does not matter how slowly you go as long as you do not stop."
        ),
        Quote(
            "nan",
            "Every day may not be good, but there's something good in every day."
        ),
        Quote(
            "Abraham Lincoln",
            "Most folks are about as happy as they make up their minds to be."
        ),
        Quote(
            "Lao Tzu",
            "If you would take, you must first give, this is the beginning of intelligence."
        ),
        Quote(
            "nan",
            "Some people think it's holding that makes one strong, sometimes it's letting go."
        ),
        Quote(
            "Havelock Ellis",
            "It is on our failures that we base a new and different and better success."
        ),
        Quote(
            "John Ruskin",
            "Quality is never an accident; it is always the result of intelligent effort."
        ),
        Quote(
            "Confucius",
            "To study and not think is a waste. To think and not study is dangerous."
        ),
        Quote(
            "Ralph Emerson",
            "Life is a succession of lessons, which must be lived to be understood."
        ),
        Quote(
            "Thomas Hardy",
            "Time changes everything except something within us which is always surprised by change."
        ),
        Quote(
            "Wayne Dyer",
            "You are important enough to ask and you are blessed enough to receive back."
        ),
        Quote(
            "Napoleon Hill",
            "If you cannot do great things, do small things in a great way."
        ),
        Quote(
            "Oprah Winfrey",
            "If you want your life to be more rewarding, you have to change the way you think."
        ),
        Quote(
            "Byron Pulsifer",
            "Transformation doesn't take place with a vacuum; instead, it occurs when we are indirectly and directly connected to all those around us."
        ),
        Quote(
            "Leonardo Ruiz",
            "The only difference between your abilities and others is the ability to put yourself in their shoes and actually try."
        ),
        Quote(
            "Leon Blum",
            "The free man is he who does not fear to go to the end of his thought."
        ),
        Quote(
            "Ralph Emerson",
            "Great are they who see that spiritual is stronger than any material force, that thoughts rule the world."
        ),
        Quote(
            "Bernard Shaw",
            "A life spent making mistakes is not only more honourable but more useful than a life spent in doing nothing."
        ),
        Quote(
            "Lao Tzu",
            "The wise man does not lay up his own treasures. The more he gives to others, the more he has for his own."
        ),
        Quote(
            "Charles Dickens",
            "Don't leave a stone unturned. It's always something, to know you have done the most you could."
        ),
        Quote(
            "Dalai Lama",
            "By going beyond your own problems and taking care of others, you gain inner strength, self-confidence, courage, and a greater sense of calm."
        ),
        Quote(
            "Sam Keen",
            "We come to love not by finding a perfect person, but by learning to see an imperfect person perfectly."
        ),
        Quote(
            "Walt Emerson",
            "What lies behind us and what lies before us are tiny matters compared to what lies within us."
        ),
        Quote(
            "John Astin",
            "There are things so deep and complex that only intuition can reach it in our stage of development as human beings."
        ),
        Quote(
            "Elbert Hubbard",
            "A little more persistence, a little more effort, and what seemed hopeless failure may turn to glorious success."
        ),
        Quote(
            "Henry Moore",
            "There is no retirement for an artist, it's your way of living so there is no end to it."
        ),
        Quote(
            "Confucius",
            "I will not be concerned at other men is not knowing me;I will be concerned at my own want of ability."
        ),
        Quote(
            "nan",
            "Why worry about things you can't control when you can keep yourself busy controlling the things that depend on you?"
        ),
        Quote(
            "Laozi",
            "When you are content to be simply yourself and don't compare or compete, everybody will respect you."
        ),
        Quote(
            "William Shakespeare",
            "Be not afraid of greatness: some are born great, some achieve greatness, and some have greatness thrust upon them."
        ),
        Quote(
            "George Sheehan",
            "Success means having the courage, the determination, and the will to become the person you believe you were meant to be."
        ),
        Quote(
            "Thomas Jefferson",
            "Do you want to know who you are? Don't ask. Act! Action will delineate and define you."
        ),
        Quote(
            "Antoine de Saint-Exupery",
            "It is only with the heart that one can see rightly, what is essential is invisible to the eye."
        ),
        Quote(
            "Marcel Proust",
            "Let us be grateful to people who make us happy; they are the charming gardeners who make our souls blossom."
        ),
        Quote(
            "Epictetus",
            "Make the best use of what is in your power, and take the rest as it happens."
        ),
        Quote(
            "Louise Hay",
            "The thoughts we choose to think are the tools we use to paint the canvas of our lives."
        ),
        Quote(
            "W. Clement Stone",
            "No matter how carefully you plan your goals they will never be more that pipe dreams unless you pursue them with gusto."
        ),
        Quote(
            "Robert McKain",
            "The reason most goals are not achieved is that we spend our time doing second things first."
        ),
        Quote(
            "John Quincy Adams",
            "If your actions inspire others to dream more, learn more, do more and become more, you are a leader."
        ),
        Quote(
            "Thomas Jefferson",
            "I'm a great believer in luck and I find the harder I work, the more I have of it."
        ),
        Quote(
            "Ralph Emerson",
            "Do not waste yourself in rejection, nor bark against the bad, but chant the beauty of the good."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "The person born with a talent they are meant to use will find their greatest happiness in using it."
        ),
        Quote(
            "William Saroyan",
            "Good people are good because they've come to wisdom through failure. We get very little wisdom from success, you know."
        ),
        Quote(
            "Byron Pulsifer",
            "Your destiny isn't just fate; it is how you use your own developed abilities to get what you want."
        ),
        Quote(
            "Leonardo da Vinci",
            "Iron rusts from disuse; water loses its purity from stagnation... even so does inaction sap the vigour of the mind."
        ),
        Quote(
            "Isaac Asimov",
            "A subtle thought that is in error may yet give rise to fruitful inquiry that can establish truths of great value."
        ),
        Quote(
            "Henry Van Dyke",
            "Be glad of life because it gives you the chance to love, to work, to play, and to look up at the stars."
        ),
        Quote(
            "Yogi Berra",
            "You got to be careful if you don't know where you're going, because you might not get there."
        ),
        Quote(
            "Naguib Mahfouz",
            "You can tell whether a man is clever by his answers. You can tell whether a man is wise by his questions."
        ),
        Quote(
            "Anthony Robbins",
            "Life is a gift, and it offers us the privilege, opportunity, and responsibility to give something back by becoming more"
        ),
        Quote(
            "John Wooden",
            "You can't let praise or criticism get to you. It's a weakness to get caught up in either one."
        ),
        Quote(
            "Og Mandino",
            "I will love the light for it shows me the way, yet I will endure the darkness because it shows me the stars."
        ),
        Quote(
            "Jane Addams",
            "Our doubts are traitors and make us lose the good we often might win, by fearing to attempt."
        ),
        Quote(
            "Thomas Carlyle",
            "By nature man hates change; seldom will he quit his old home till it has actually fallen around his ears."
        ),
        Quote(
            "M. Scott Peck",
            "Until you value yourself, you won't value your time. Until you value your time, you won't do anything with it."
        ),
        Quote(
            "Maureen Dowd",
            "The minute you settle for less than you deserve, you get even less than you settled for."
        ),
        Quote(
            "Charles Darwin",
            "The highest stage in moral ure at which we can arrive is when we recognize that we ought to control our thoughts."
        ),
        Quote(
            "nan",
            "It is better to take many small steps in the right direction than to make a great leap forward only to stumble backward."
        ),
        Quote(
            "Dalai Lama",
            "If we have a positive mental attitude, then even when surrounded by hostility, we shall not lack inner peace."
        ),
        Quote(
            "Christopher Morley",
            "There is only one success, to be able to spend your life in your own way."
        ),
        Quote(
            "Hannah Arendt",
            "Promises are the uniquely human way of ordering the future, making it predictable and reliable to the extent that this is humanly possible."
        ),
        Quote(
            "Alan Cohen",
            "Appreciation is the highest form of prayer, for it acknowledges the presence of good wherever you shine the light of your thankful thoughts."
        ),
        Quote(
            "Aldous Huxley",
            "There is only one corner of the universe you can be certain of improving, and that's your own self."
        ),
        Quote(
            "Marian Edelman",
            "You're not obligated to win. You're obligated to keep trying to do the best you can every day."
        ),
        Quote(
            "Byron Pulsifer",
            "Everyone can taste success when the going is easy, but few know how to taste victory when times get tough."
        ),
        Quote(
            "Sue Patton Thoele",
            "Deep listening is miraculous for both listener and speaker.When someone receives us with open-hearted, non-judging, intensely interested listening, our spirits expand."
        ),
        Quote(
            "Frank Crane",
            "You may be deceived if you trust too much, but you will live in torment if you don't trust enough."
        ),
        Quote(
            "Lao Tzu",
            "Great indeed is the sublimity of the Creative, to which all beings owe their beginning and which permeates all heaven."
        ),
        Quote(
            "Kathleen Norris",
            "All that is necessary is to accept the impossible, do without the indispensable, and bear the intolerable."
        ),
        Quote(
            "Confucius",
            "Choose a job you love, and you will never have to work a day in your life."
        ),
        Quote(
            "Eckhart Tolle",
            "You cannot find yourself by going into the past. You can find yourself by coming into the present."
        ),
        Quote(
            "Anne Bronte",
            "All our talents increase in the using, and the every faculty, both good and bad, strengthen by exercise."
        ),
        Quote(
            "Richard Bach",
            "In order to live free and happily you must sacrifice boredom. It is not always an easy sacrifice."
        ),
        Quote(
            "Desiderius Erasmus",
            "The fox has many tricks. The hedgehog has but one. But that is the best of all."
        ),
        Quote(
            "Arthur Rubinstein",
            "Of course there is no formula for success except perhaps an unconditional acceptance of life and what it brings."
        ),
        Quote(
            "Louis Pasteur",
            "Let me tell you the secret that has led me to my goal: my strength lies solely in my tenacity"
        ),
        Quote(
            "Rumi",
            "Something opens our wings. Something makes boredom and hurt disappear. Someone fills the cup in front of us: We taste only sacredness."
        ),
        Quote(
            "Sogyal Rinpoche",
            "We must never forget that it is through our actions, words, and thoughts that we have a choice."
        ),
        Quote(
            "Dennis Kimbro",
            "We see things not as they are, but as we are. Our perception is shaped by our previous experiences."
        ),
        Quote(
            "William Penn",
            "True silence is the rest of the mind; it is to the spirit what sleep is to the body, nourishment and refreshment."
        ),
        Quote(
            "Immanuel Kant",
            "All our knowledge begins with the senses, proceeds then to the understanding, and ends with reason. There is nothing higher than reason."
        ),
        Quote(
            "Buddha",
            "The thought manifests as the word. The word manifests as the deed. The deed develops into habit. And the habit hardens into character."
        ),
        Quote(
            "nan",
            "As the rest of the world is walking out the door, your best friends are the ones walking in."
        ),
        Quote(
            "Byron Pulsifer",
            "Patience is a virtue but you will never ever accomplish anything if you don't exercise action over patience."
        ),
        Quote(
            "Robert Lynd",
            "Any of us can achieve virtue, if by virtue we merely mean the avoidance of the vices that do not attract us."
        ),
        Quote(
            "Ralph Emerson",
            "If the single man plant himself indomitably on his instincts, and there abide, the huge world will come round to him."
        ),
        Quote(
            "Donald Trump",
            "Money was never a big motivation for me, except as a way to keep score. The real excitement is playing the game."
        ),
        Quote(
            "Eleanor Roosevelt",
            "Friendship with oneself is all important because without it one cannot be friends with anybody else in the world."
        ),
        Quote(
            "Robert Fulghum",
            "Peace is not something you wish for. It's something you make, something you do, something you are, and something you give away."
        ),
        Quote(
            "Bruce Lee",
            "A wise man can learn more from a foolish question than a fool can learn from a wise answer."
        ),
        Quote(
            "Arthur Schopenhauer",
            "Every man takes the limits of his own field of vision for the limits of the world."
        ),
        Quote(
            "Andre Gide",
            "One does not discover new lands without consenting to lose sight of the shore for a very long time."
        ),
        Quote(
            "Sai Baba",
            "What is new in the world? Nothing. What is old in the world? Nothing. Everything has always been and will always be."
        ),
        Quote(
            "Dalai Lama",
            "Genuine love should first be directed at oneself. if we do not love ourselves, how can we love others?"
        ),
        Quote(
            "Tom Lehrer",
            "Life is like a sewer. What you get out of it depends on what you put into it."
        ),
        Quote(
            "Bruce Lee",
            "Notice that the stiffest tree is most easily cracked, while the bamboo or willow survives by bending with the wind."
        ),
        Quote(
            "Alfred Sheinwold",
            "Learn all you can from the mistakes of others. You won't have time to make them all yourself."
        ),
        Quote(
            "Sri Chinmoy",
            "Judge nothing, you will be happy. Forgive everything, you will be happier. Love everything, you will be happiest."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "People are so constituted that everybody would rather undertake what they see others do, whether they have an aptitude for it or not."
        ),
        Quote(
            "James Freeman Clarke",
            "We are either progressing or retrograding all the while. There is no such thing as remaining stationary in this life."
        ),
        Quote(
            "Anais Nin",
            "The possession of knowledge does not kill the sense of wonder and mystery. There is always more mystery."
        ),
        Quote(
            "Marcus Aurelius",
            "Everything that happens happens as it should, and if you observe carefully, you will find this to be so."
        ),
        Quote(
            "Wayne Dyer",
            "What we think determines what happens to us, so if we want to change our lives, we need to stretch our minds."
        ),
        Quote(
            "Buddha",
            "In a controversy the instant we feel anger we have already ceased striving for the truth, and have begun striving for ourselves."
        ),
        Quote(
            "Sydney Smith",
            "It is the greatest of all mistakes to do nothing because you can only do little, do what you can."
        ),
        Quote(
            "Confucius",
            "When you see a man of worth, think of how you may emulate him. When you see one who is unworthy, examine yourself."
        ),
        Quote(
            "Mary Kay Ash",
            "Aerodynamically the bumblebee shouldn't be able to fly, but the bumblebee doesn't know that so it goes on flying anyway."
        ),
        Quote(
            "Lloyd Jones",
            "Those who try to do something and fail are infinitely better than those who try nothing and succeed."
        ),
        Quote(
            "Vista Kelly",
            "Snowflakes are one of natures most fragile things, but just look what they can do when they stick together."
        ),
        Quote(
            "Ben Stein",
            "The first step to getting the things you want out of life is this: decide what you want."
        ),
        Quote(
            "nan",
            "Why compare yourself with others? No one in the entire world can do a better job of being you than you."
        ),
        Quote(
            "Aldous Huxley",
            "Experience is not what happens to a man. It is what a man does with what happens to him."
        ),
        Quote(
            "nan",
            "A good teacher is like a candle, it consumes itself to light the way for others."
        ),
        Quote(
            "Oscar Wilde",
            "The only thing to do with good advice is to pass it on. It is never of any use to oneself."
        ),
        Quote(
            "nan",
            "Life is not measured by the breaths we take, but by the moments that take our breath."
        ),
        Quote(
            "Honore de Balzac",
            "The smallest flower is a thought, a life answering to some feature of the Great Whole, of whom they have a persistent intuition."
        ),
        Quote(
            "Jacob Braude",
            "Consider how hard it is to change yourself and you'll understand what little chance you have in trying to change others."
        ),
        Quote(
            "Vince Lombardi",
            "If you'll not settle for anything less than your best, you will be amazed at what you can accomplish in your lives."
        ),
        Quote(
            "Oliver Holmes",
            "What lies behind us and what lies before us are small matters compared to what lies within us."
        ),
        Quote(
            "Dalai Lama",
            "With the realization of ones own potential and self-confidence in ones ability, one can build a better world."
        ),
        Quote(
            "Nelson Mandela",
            "There is nothing like returning to a place that remains unchanged to find the ways in which you yourself have altered."
        ),
        Quote(
            "Robert Anthony",
            "Forget about all the reasons why something may not work. You only need to find one good reason why it will."
        ),
        Quote(
            "Aristotle",
            "It is the mark of an educated mind to be able to entertain a thought without accepting it."
        ),
        Quote(
            "Washington Irving",
            "Love is never lost. If not reciprocated, it will flow back and soften and purify the heart."
        ),
        Quote(
            "Anne Frank",
            "We all live with the objective of being happy; our lives are all different and yet the same."
        ),
        Quote(
            "Byron Pulsifer",
            "Many people think of prosperity that concerns money only to forget that true prosperity is of the mind."
        ),
        Quote(
            "Thich Nhat Hanh",
            "To be beautiful means to be yourself. You don't need to be accepted by others. You need to accept yourself."
        ),
        Quote(
            "Buddha",
            "Do not overrate what you have received, nor envy others. He who envies others does not obtain peace of mind."
        ),
        Quote(
            "Jessamyn West",
            "It is very easy to forgive others their mistakes; it takes more grit to forgive them for having witnessed your own."
        ),
        Quote(
            "Plato",
            "Bodily exercise, when compulsory, does no harm to the body; but knowledge which is acquired under compulsion obtains no hold on the mind."
        ),
        Quote(
            "Bruce Lee",
            "Always be yourself, express yourself, have faith in yourself, do not go out and look for a successful personality and duplicate it."
        ),
        Quote(
            "Charlotte Gilman",
            "Let us revere, let us worship, but erect and open-eyed, the highest, not the lowest; the future, not the past!"
        ),
        Quote(
            "Mother Teresa",
            "Every time you smile at someone, it is an action of love, a gift to that person, a beautiful thing."
        ),
        Quote(
            "Margaret Runbeck",
            "Silences make the real conversations between friends. Not the saying but the never needing to say is what counts."
        ),
        Quote(
            "Dalai Lama",
            "The key to transforming our hearts and minds is to have an understanding of how our thoughts and emotions work."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "If you must tell me your opinions, tell me what you believe in. I have plenty of douts of my own."
        ),
        Quote(
            "Ovid",
            "Chance is always powerful. Let your hook be always cast; in the pool where you least expect it, there will be a fish."
        ),
        Quote(
            "Og Mandino",
            "I seek constantly to improve my manners and graces, for they are the sugar to which all are attracted."
        ),
        Quote(
            "James Barrie",
            "We never understand how little we need in this world until we know the loss of it."
        ),
        Quote(
            "nan",
            "The real measure of your wealth is how much youd be worth if you lost all your money."
        ),
        Quote(
            "Buddha",
            "To keep the body in good health is a duty... otherwise we shall not be able to keep our mind strong and clear."
        ),
        Quote(
            "Bruce Lee",
            "Take no thought of who is right or wrong or who is better than. Be not for or against."
        ),
        Quote(
            "Everett Dirksen",
            "I am a man of fixed and unbending principles, the first of which is to be flexible at all times."
        ),
        Quote(
            "Byron Pulsifer",
            "Today, give a stranger a smile without waiting for it may be the joy they need to have a great day."
        ),
        Quote(
            "Henry Miller",
            "The moment one gives close attention to anything, even a blade of grass, it becomes a mysterious, awesome, indescribably magnificent world in itself."
        ),
        Quote(
            "Lao Tzu",
            "At the center of your being you have the answer; you know who you are and you know what you want."
        ),
        Quote(
            "Niels Bohr",
            "How wonderful that we have met with a paradox. Now we have some hope of making progress."
        ),
        Quote(
            "Georg Lichtenberg",
            "Everyone is a genius at least once a year. A real genius has his original ideas closer together."
        ),
        Quote(
            "Anais Nin",
            "Dreams pass into the reality of action. From the actions stems the dream again; and this interdependence produces the highest form of living."
        ),
        Quote(
            "Gloria Steinem",
            "Without leaps of imagination, or dreaming, we lose the excitement of possibilities. Dreaming, after all, is a form of planning."
        ),
        Quote(
            "Byron Pulsifer",
            "Sadness may be part of life but there is no need to let it dominate your entire life."
        ),
        Quote(
            "Charles Schwab",
            "Keeping a little ahead of conditions is one of the secrets of business, the trailer seldom goes far."
        ),
        Quote(
            "Epictetus",
            "Nature gave us one tongue and two ears so we could hear twice as much as we speak."
        ),
        Quote(
            "Barbara Baron",
            "Don't wait for your feelings to change to take the action. Take the action and your feelings will change."
        ),
        Quote(
            "Richard Bach",
            "You are always free to change your mind and choose a different future, or a different past."
        ),
        Quote(
            "Lou Holtz",
            "You were not born a winner, and you were not born a loser. You are what you make yourself be."
        ),
        Quote(
            "Napoleon Hill",
            "Cherish your visions and your dreams as they are the children of your soul, the blueprints of your ultimate achievements."
        ),
        Quote(
            "Napoleon Hill",
            "Cherish your visions and your dreams as they are the children of your soul; the blueprints of your ultimate achievements."
        ),
        Quote(
            "Robert Stevenson",
            "To be what we are, and to become what we are capable of becoming, is the only end of life."
        ),
        Quote(
            "Charles DeLint",
            "The road leading to a goal does not separate you from the destination; it is essentially a part of it."
        ),
        Quote(
            "Bruce Lee",
            "Take things as they are. Punch when you have to punch. Kick when you have to kick."
        ),
        Quote(
            "Albert Einstein",
            "I believe that a simple and unassuming manner of life is best for everyone, best both for the body and the mind."
        ),
        Quote(
            "nan",
            "Though no one can go back and make a brand new start, anyone can start from now and make a brand new ending."
        ),
        Quote(
            "Paavo Nurmi",
            "Mind is everything: muscle, pieces of rubber. All that I am, I am because of my mind."
        ),
        Quote(
            "Anne Frank",
            "How wonderful it is that nobody need wait a single moment before starting to improve the world."
        ),
        Quote(
            "nan",
            "A friend is someone who understands your past, believes in your future, and accepts you just the way you are."
        ),
        Quote(
            "Ralph Emerson",
            "It is one of the blessings of old friends that you can afford to be stupid with them."
        ),
        Quote(
            "Tryon Edwards",
            "He that never changes his opinions, never corrects his mistakes, and will never be wiser on the morrow than he is today."
        ),
        Quote(
            "Abraham Lincoln",
            "Give me six hours to chop down a tree and I will spend the first four sharpening the axe."
        ),
        Quote(
            "E. M. Forster",
            "One must be fond of people and trust them if one is not to make a mess of life."
        ),
        Quote(
            "David Seamans",
            "We cannot change our memories, but we can change their meaning and the power they have over us."
        ),
        Quote(
            "Confucius",
            "Being in humaneness is good. If we select other goodness and thus are far apart from humaneness, how can we be the wise?"
        ),
        Quote(
            "Byron Pulsifer",
            "To give hope to someone occurs when you teach them how to use the tools to do it for themselves."
        ),
        Quote(
            "Lucille Ball",
            "Id rather regret the things that I have done than the things that I have not done."
        ),
        Quote(
            "Eckhart Tolle",
            "The past has no power to stop you from being present now. Only your grievance about the past can do that."
        ),
        Quote(
            "Ralph Emerson",
            "If the stars should appear but one night every thousand years how man would marvel and adore."
        ),
        Quote(
            "Laurence J. Peter",
            "There are two kinds of failures: those who thought and never did, and those who did and never thought."
        ),
        Quote(
            "Elizabeth Arden",
            "I'm not interested in age. People who tell me their age are silly. You're as old as you feel."
        ),
        Quote(
            "Dalai Lama",
            "I find hope in the darkest of days, and focus in the brightest. I do not judge the universe."
        ),
        Quote(
            "Confucius",
            "When it is obvious that the goals cannot be reached, don't adjust the goals, adjust the action steps."
        ),
        Quote(
            "Nikola Tesla",
            "Our virtues and our failings are inseparable, like force and matter. When they separate, man is no more."
        ),
        Quote(
            "Leo Aikman",
            "Blessed is the person who is too busy to worry in the daytime, and too sleepy to worry at night."
        ),
        Quote(
            "Pablo Picasso",
            "He can who thinks he can, and he can't who thinks he can't. This is an inexorable, indisputable law."
        ),
        Quote(
            "Vernon Cooper",
            "These days people seek knowledge, not wisdom. Knowledge is of the past, wisdom is of the future."
        ),
        Quote(
            "Benjamin Disraeli",
            "One secret of success in life is for a man to be ready for his opportunity when it comes."
        ),
        Quote(
            "Dalai Lama",
            "People take different roads seeking fulfilment and happiness. Just because theyre not on your road doesn't mean they've gotten lost."
        ),
        Quote(
            "Carl Jung",
            "The shoe that fits one person pinches another; there is no recipe for living that suits all cases."
        ),
        Quote(
            "Buddha",
            "There are only two mistakes one can make along the road to truth; not going all the way, and not starting."
        ),
        Quote(
            "Marcus Aurelius",
            "Very little is needed to make a happy life; it is all within yourself, in your way of thinking."
        ),
        Quote(
            "nan",
            "Giving up doesn't always mean you are weak. Sometimes it means that you are strong enough to let go."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Treat people as if they were what they ought to be and you help them to become what they are capable of being."
        ),
        Quote(
            "Thich Nhat Hanh",
            "The most precious gift we can offer anyone is our attention. When mindfulness embraces those we love, they will bloom like flowers."
        ),
        Quote(
            "Jack Dixon",
            "If you focus on results, you will never change. If you focus on change, you will get results."
        ),
        Quote(
            "G. K. Chesterton",
            "I would maintain that thanks are the highest form of thought, and that gratitude is happiness doubled by wonder."
        ),
        Quote(
            "Denis Waitley",
            "There are two primary choices in life: to accept conditions as they exist, or accept the responsibility for changing them."
        ),
        Quote(
            "Lao-Tzu",
            "All difficult things have their origin in that which is easy, and great things in that which is small."
        ),
        Quote(
            "Byron Pulsifer",
            "You can be what you want to be. You have the power within and we will help you always."
        ),
        Quote(
            "Johannes Gaertner",
            "To speak gratitude is courteous and pleasant, to enact gratitude is generous and noble, but to live gratitude is to touch Heaven."
        ),
        Quote(
            "Doug Larson",
            "Wisdom is the reward you get for a lifetime of listening when you'd have preferred to talk."
        ),
        Quote(
            "Charles Lamb",
            "The greatest pleasure I know is to do a good action by stealth, and to have it found out by accident."
        ),
        Quote(
            "John Muir",
            "When one tugs at a single thing in nature, he finds it attached to the rest of the world."
        ),
        Quote(
            "Winston Churchill",
            "Courage is what it takes to stand up and speak; courage is also what it takes to sit down and listen."
        ),
        Quote(
            "Helen Keller",
            "The most beautiful things in the world cannot be seen or even touched. They must be felt with the heart."
        ),
        Quote(
            "Buddha",
            "To live a pure unselfish life, one must count nothing as ones own in the midst of abundance."
        ),
        Quote(
            "Thomas Edison",
            "Many of life's failures are people who did not realize how close they were to success when they gave up."
        ),
        Quote(
            "William Ward",
            "When we seek to discover the best in others, we somehow bring out the best in ourselves."
        ),
        Quote(
            "Michael Jordan",
            "If you accept the expectations of others, especially negative ones, then you never will change the outcome."
        ),
        Quote(
            "Oliver Holmes",
            "A man may fulfil the object of his existence by asking a question he cannot answer, and attempting a task he cannot achieve."
        ),
        Quote(
            "Confucius",
            "I am not bothered by the fact that I am unknown. I am bothered when I do not know others."
        ),
        Quote(
            "Epictetus",
            "He is a wise man who does not grieve for the things which he has not, but rejoices for those which he has."
        ),
        Quote(
            "Pablo Picasso",
            "I am always doing that which I cannot do, in order that I may learn how to do it."
        ),
        Quote(
            "Barack Obama",
            "If you're walking down the right path and you're willing to keep walking, eventually you'll make progress."
        ),
        Quote(
            "Ivy Baker Priest",
            "The world is round and the place which may seem like the end may also be the beginning."
        ),
        Quote(
            "nan",
            "Never miss an opportunity to make others happy, even if you have to leave them alone in order to do it."
        ),
        Quote(
            "Danielle Ingrum",
            "Give it all you've got because you never know if there's going to be a next time."
        ),
        Quote(
            "Old German proverb",
            "You have to take it as it happens, but you should try to make it happen the way you want to take it."
        ),
        Quote(
            "Ralph Blum",
            "Nothing is predestined: The obstacles of your past can become the gateways that lead to new beginnings."
        ),
        Quote(
            "Bruce Lee",
            "Im not in this world to live up to your expectations and you're not in this world to live up to mine."
        ),
        Quote(
            "Thich Nhat Hanh",
            "Sometimes your joy is the source of your smile, but sometimes your smile can be the source of your joy."
        ),
        Quote(
            "Walter Cronkite",
            "I can't imagine a person becoming a success who doesn't give this game of life everything hes got."
        ),
        Quote(
            "Socrates",
            "The greatest way to live with honor in this world is to be what we pretend to be."
        ),
        Quote(
            "Seneca",
            "The conditions of conquest are always easy. We have but to toil awhile, endure awhile, believe always, and never turn back."
        ),
        Quote(
            "Chalmers",
            "The grand essentials of happiness are: something to do, something to love, and something to hope for."
        ),
        Quote(
            "Thich Nhat Hanh",
            "By living deeply in the present moment we can understand the past better and we can prepare for a better future."
        ),
        Quote(
            "Ralph Emerson",
            "Do not be too timid and squeamish about your reactions. All life is an experiment. The more experiments you make the better."
        ),
        Quote(
            "Ralph Emerson",
            "Do not go where the path may lead, go instead where there is no path and leave a trail."
        ),
        Quote(
            "Robert Louis Stevenson",
            "There is no duty we so underrate as the duty of being happy. By being happy we sow anonymous benefits upon the world."
        ),
        Quote(
            "Napoleon Hill",
            "Edison failed 10,000 times before he made the electric light. Do not be discouraged if you fail a few times."
        ),
        Quote(
            "nan",
            "Yesterday is history. Tomorrow is a mystery. And today? Today is a gift that's why they call it the present."
        ),
        Quote(
            "Henry Thoreau",
            "The only way to tell the truth is to speak with kindness. Only the words of a loving man can be heard."
        ),
        Quote(
            "Benjamin Disraeli",
            "The greatest good you can do for another is not just to share your riches but to reveal to him his own."
        ),
        Quote(
            "Brian Tracy",
            "You can only grow if you're willing to feel awkward and uncomfortable when you try something new."
        ),
        Quote(
            "Joan Didion",
            "To free us from the expectations of others, to give us back to ourselves, there lies the great, singular power of self-respect."
        ),
        Quote(
            "Mabel Newcomber",
            "It is more important to know where you are going than to get there quickly. Do not mistake activity for achievement."
        ),
        Quote(
            "nan",
            "When you don't know what you believe, everything becomes an argument. Everything is debatable. But when you stand for something, decisions are obvious."
        ),
        Quote(
            "Robert Graves",
            "Intuition is the supra-logic that cuts out all the routine processes of thought and leaps straight from the problem to the answer."
        ),
        Quote(
            "Frank Wright",
            "The thing always happens that you really believe in; and the belief in a thing makes it happen."
        ),
        Quote(
            "Francois de La Rochefoucauld",
            "A true friend is the most precious of all possessions and the one we take the least thought about acquiring."
        ),
        Quote(
            "Epictetus",
            "There is only one way to happiness and that is to cease worrying about things which are beyond the power of our will."
        ),
        Quote(
            "Margaret Cousins",
            "Appreciation can make a day, even change a life. Your willingness to put it into words is all that is necessary."
        ),
        Quote(
            "nan",
            "Every sixty seconds you spend angry, upset or mad, is a full minute of happiness you'll never get back."
        ),
        Quote(
            "Thomas Carlyle",
            "This world, after all our science and sciences, is still a miracle; wonderful, inscrutable, magical and more, to whosoever will think of it."
        ),
        Quote(
            "Pearl Buck",
            "Every great mistake has a halfway moment, a split second when it can be recalled and perhaps remedied."
        ),
        Quote(
            "Catherine Pulsifer",
            "You can adopt the attitude there is nothing you can do, or you can see the challenge as your call to action."
        ),
        Quote(
            "Alfred Tennyson",
            "The happiness of a man in this life does not consist in the absence but in the mastery of his passions."
        ),
        Quote(
            "Margaret Mead",
            "Never doubt that a small group of thoughtful, committed people can change the world. Indeed. It is the only thing that ever has."
        ),
        Quote(
            "Ovid",
            "Let your hook always be cast; in the pool where you least expect it, there will be a fish."
        ),
        Quote(
            "Remez Sasson",
            "You get peace of mind not by thinking about it or imagining it, but by quietening and relaxing the restless mind."
        ),
        Quote(
            "Richard Bach",
            "Your friends will know you better in the first minute you meet than your acquaintances will know you in a thousand years."
        ),
        Quote(
            "Pema Chodron",
            "When you begin to touch your heart or let your heart be touched, you begin to discover that it's bottomless."
        ),
        Quote(
            "Richard Bach",
            "If you love someone, set them free. If they come back they're yours; if they don't they never were."
        ),
        Quote(
            "David Jordan",
            "Wisdom is knowing what to do next; Skill is knowing how to do it, and Virtue is doing it."
        ),
        Quote(
            "Richard Bach",
            "Bad things are not the worst things that can happen to us. Nothing is the worst thing that can happen to us!"
        ),
        Quote(
            "Alan Watts",
            "No valid plans for the future can be made by those who have no capacity for living now."
        ),
        Quote(
            "Oscar Wilde",
            "The aim of life is self-development. To realize ones nature perfectly, that is what each of us is here for."
        ),
        Quote(
            "Anatole France",
            "To accomplish great things, we must not only act, but also dream; not only plan, but also believe."
        ),
        Quote(
            "Thomas Edison",
            "The first requisite for success is the ability to apply your physical and mental energies to one problem incessantly without growing weary."
        ),
        Quote(
            "John Steinbeck",
            "If we could learn to like ourselves, even a little, maybe our cruelties and angers might melt away."
        ),
        Quote(
            "nan",
            "If we are facing in the right direction, all we have to do is keep on walking."
        ),
        Quote(
            "Eleanor Roosevelt",
            "Remember always that you not only have the right to be an individual, you have an obligation to be one."
        ),
        Quote(
            "Denis Waitley",
            "There are two primary choices in life: to accept conditions as they exist, or accept responsibility for changing them."
        ),
        Quote(
            "Epictetus",
            "If you seek truth you will not seek victory by dishonourable means, and if you find truth you will become invincible."
        ),
        Quote(
            "Eknath Easwaran",
            "Through meditation and by giving full attention to one thing at a time, we can learn to direct attention where we choose."
        ),
        Quote(
            "Helen Keller",
            "We could never learn to be brave and patient if there were only joy in the world."
        ),
        Quote(
            "Marcus Aurelius",
            "If it is not right do not do it; if it is not true do not say it."
        ),
        Quote(
            "Norman Schwarzkopf",
            "The truth of the matter is that you always know the right thing to do. The hard part is doing it."
        ),
        Quote(
            "Julie Morgenstern",
            "Some people thrive on huge, dramatic change. Some people prefer the slow and steady route. Do what's right for you."
        ),
        Quote(
            "Blaise Pascal",
            "Man is equally incapable of seeing the nothingness from which he emerges and the infinity in which he is engulfed."
        ),
        Quote(
            "Laura Teresa Marquez",
            "Arrogance and rudeness are training wheels on the bicycle of life, for weak people who cannot keep their balance without them."
        ),
        Quote(
            "Chinese proverb",
            "If you are patient in one moment of anger, you will escape one hundred days of sorrow."
        ),
        Quote(
            "Abraham Lincoln",
            "When you have got an elephant by the hind legs and he is trying to run away, it's best to let him run."
        ),
        Quote(
            "Byron Pulsifer",
            "Courage is not about taking risks unknowingly but putting your own being in front of challenges that others may not be able to."
        ),
        Quote(
            "Richard Bach",
            "Can miles truly separate you from friends... If you want to be with someone you love, aren't you already there?"
        ),
        Quote(
            "Harry Kemp",
            "The poor man is not he who is without a cent, but he who is without a dream."
        ),
        Quote(
            "Benjamin Disraeli",
            "The greatest good you can do for another is not just share your riches, but reveal to them their own."
        ),
        Quote(
            "Buddha",
            "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment."
        ),
        Quote(
            "nan",
            "Peace of mind is not the absence of conflict from life, but the ability to cope with it."
        ),
        Quote(
            "Helen Keller",
            "Face your deficiencies and acknowledge them; but do not let them master you. Let them teach you patience, sweetness, insight."
        ),
        Quote(
            "John Kennedy",
            "Change is the law of life. And those who look only to the past or present are certain to miss the future."
        ),
        Quote(
            "Marcus Aurelius",
            "You have power over your mind, not outside events. Realize this, and you will find strength."
        ),
        Quote(
            "Louis Pasteur",
            "Let me tell you the secret that has led me to my goal: my strength lies solely in my tenacity."
        ),
        Quote(
            "Buddha",
            "We are what we think. All that we are arises with our thoughts. With our thoughts, we make the world."
        ),
        Quote(
            "Henry Longfellow",
            "He that respects himself is safe from others; he wears a coat of mail that none can pierce."
        ),
        Quote(
            "Wayne Dyer",
            "I cannot always control what goes on outside. But I can always control what goes on inside."
        ),
        Quote(
            "Daisaku Ikeda",
            "What matters is the value we've created in our lives, the people we've made happy and how much we've grown as people."
        ),
        Quote(
            "Epictetus",
            "When you are offended at any man's fault, turn to yourself and study your own failings. Then you will forget your anger."
        ),
        Quote(
            "Rumi",
            "Everyone has been made for some particular work, and the desire for that work has been put in every heart."
        ),
        Quote(
            "Napoleon Bonaparte",
            "Take time to deliberate, but when the time for action has arrived, stop thinking and go in."
        ),
        Quote(
            "Dalai Lama",
            "With realization of ones own potential and self-confidence in ones ability, one can build a better world."
        ),
        Quote(
            "Franklin Roosevelt",
            "Happiness is not in the mere possession of money; it lies in the joy of achievement, in the thrill of creative effort."
        ),
        Quote(
            "Pearl Buck",
            "You cannot make yourself feel something you do not feel, but you can make yourself do right in spite of your feelings."
        ),
        Quote(
            "Mary Kay Ash",
            "Those who are blessed with the most talent don't necessarily outperform everyone else. It's the people with follow-through who excel."
        ),
        Quote(
            "Albert Einstein",
            "Try not to become a man of success, but rather try to become a man of value."
        ),
        Quote(
            "Sophocles",
            "Men of perverse opinion do not know the excellence of what is in their hands, till some one dash it from them."
        ),
        Quote(
            "Rene Descartes",
            "It is not enough to have a good mind; the main thing is to use it well."
        ),
        Quote(
            "Byron Pulsifer",
            "Responsibility is not inherited, it is a choice that everyone needs to make at some point in their life."
        ),
        Quote(
            "Amelia Earhart",
            "Never do things others can do and will do, if there are things others cannot do or will not do."
        ),
        Quote(
            "Jimmy Dean",
            "I can't change the direction of the wind, but I can adjust my sails to always reach my destination."
        ),
        Quote(
            "George Allen",
            "People of mediocre ability sometimes achieve outstanding success because they don't know when to quit. Most men succeed because they are determined to."
        ),
        Quote(
            "Joseph Roux",
            "A fine quotation is a diamond on the finger of a man of wit, and a pebble in the hand of a fool."
        ),
        Quote(
            "Bernice Reagon",
            "Life's challenges are not supposed to paralyse you, they're supposed to help you discover who you are."
        ),
        Quote(
            "Socrates",
            "The greatest way to live with honour in this world is to be what we pretend to be."
        ),
        Quote(
            "Henri Bergson",
            "To exist is to change, to change is to mature, to mature is to go on creating oneself endlessly."
        ),
        Quote(
            "Albert Einstein",
            "Try not to become a man of success but rather try to become a man of value."
        ),
        Quote(
            "Byron Pulsifer",
            "You can't create in a vacuum. Life gives you the material and dreams can propel new beginnings."
        ),
        Quote(
            "Buddha",
            "Your work is to discover your world and then with all your heart give yourself to it."
        ),
        Quote(
            "Daisaku Ikeda",
            "The person who lives life fully, glowing with life's energy, is the person who lives a successful life."
        ),
        Quote(
            "Richard Bach",
            "Don't turn away from possible futures before you're certain you don't have anything to learn from them."
        ),
        Quote(
            "David Brinkley",
            "A successful person is one who can lay a firm foundation with the bricks that others throw at him or her."
        ),
        Quote(
            "Buddha",
            "All that we are is the result of what we have thought. The mind is everything. What we think we become."
        ),
        Quote(
            "Henri-Frederic Amiel",
            "Work while you have the light. You are responsible for the talent that has been entrusted to you."
        ),
        Quote(
            "William Shakespeare",
            "How far that little candle throws its beams! So shines a good deed in a naughty world."
        ),
        Quote(
            "Napoleon Hill",
            "Every adversity, every failure, every heartache carries with it the seed of an equal or greater benefit."
        ),
        Quote(
            "Tony Robbins",
            "It is in your moments of decision that your destiny is shaped."
        ),
        Quote(
            "nan",
            "An obstacle may be either a stepping stone or a stumbling block."
        ),
        Quote(
            "Pierre Auguste Renoir",
            "The pain passes, but the beauty remains."
        ),
        Quote(
            "Bob Newhart",
            "All I can say about life is, Oh God, enjoy it!"
        ),
        Quote(
            "Rita Mae Brown",
            "Creativity comes from trust. Trust your instincts. And never hope more than you work."
        ),
        Quote(
            "Lululemon",
            "Your outlook on life is a direct reflection on how much you like yourself."
        ),
        Quote(
            "Lao Tzu",
            "I have just three things to teach: simplicity, patience, compassion. These three are your greatest treasures."
        ),
        Quote(
            "Kin Hubbard",
            "You won't skid if you stay in a rut."
        ),
        Quote(
            "Mary Morrissey",
            "You block your dream when you allow your fear to grow bigger than your faith."
        ),
        Quote(
            "Aristotle",
            "Happiness depends upon ourselves."
        ),
        Quote(
            "Albert Schweitzer",
            "Wherever a man turns he can find someone who needs him."
        ),
        Quote(
            "Maya Angelou",
            "If one is lucky, a solitary fantasy can totally transform one million realities."
        ),
        Quote(
            "Leo Buscaglia",
            "Never idealize others. They will never live up to your expectations."
        ),
        Quote(
            "Lao Tzu",
            "When you realize there is nothing lacking, the whole world belongs to you."
        ),
        Quote(
            "Dalai Lama",
            "Happiness is not something ready made. It comes from your own actions."
        ),
        Quote(
            "Peter Elbow",
            "Meaning is not what you start with but what you end up with."
        ),
        Quote(
            "Anne Frank",
            "No one has ever become poor by giving."
        ),
        Quote(
            "Mother Teresa",
            "Be faithful in small things because it is in them that your strength lies."
        ),
        Quote(
            "Heraclitus",
            "All is flux; nothing stays still."
        ),
        Quote(
            "Leonardo da Vinci",
            "He who is fixed to a star does not change his mind."
        ),
        Quote(
            "Marcus Aurelius",
            "He who lives in harmony with himself lives in harmony with the universe."
        ),
        Quote(
            "Sophocles",
            "Ignorant men don't know what good they hold in their hands until they've flung it away."
        ),
        Quote(
            "Albert Einstein",
            "When the solution is simple, God is answering."
        ),
        Quote(
            "Napoleon Hill",
            "All achievements, all earned riches, have their beginning in an idea."
        ),
        Quote(
            "Publilius Syrus",
            "Do not turn back when you are just at the goal."
        ),
        Quote(
            "Byron Pulsifer",
            "You can't trust without risk but neither can you live in a cocoon."
        ),
        Quote(
            "Rudolf Arnheim",
            "All perceiving is also thinking, all reasoning is also intuition, all observation is also invention."
        ),
        Quote(
            "Channing",
            "Error is discipline through which we advance."
        ),
        Quote(
            "Pearl Buck",
            "The truth is always exciting. Speak it, then. Life is dull without it."
        ),
        Quote(
            "Confucius",
            "The superior man is modest in his speech, but exceeds in his actions."
        ),
        Quote(
            "Voltaire",
            "The longer we dwell on our misfortunes, the greater is their power to harm us."
        ),
        Quote(
            "Cervantes",
            "Those who will play with cats must expect to be scratched."
        ),
        Quote(
            "nan",
            "I've never seen a smiling face that was not beautiful."
        ),
        Quote(
            "Aristotle",
            "In all things of nature there is something of the marvellous."
        ),
        Quote(
            "Marcus Aurelius",
            "The universe is transformation; our life is what our thoughts make it."
        ),
        Quote(
            "Samuel Johnson",
            "Memory is the mother of all wisdom."
        ),
        Quote(
            "Confucius",
            "Silence is the true friend that never betrays."
        ),
        Quote(
            "Napoleon Hill",
            "You might well remember that nothing can bring you success but yourself."
        ),
        Quote(
            "Benjamin Franklin",
            "Watch the little things; a small leak will sink a great ship."
        ),
        Quote(
            "William Shakespeare",
            "God has given you one face, and you make yourself another."
        ),
        Quote(
            "Confucius",
            "To be wronged is nothing unless you continue to remember it."
        ),
        Quote(
            "nan",
            "Kindness is the greatest wisdom."
        ),
        Quote(
            "Tehyi Hsieh",
            "Action will remove the doubts that theory cannot solve."
        ),
        Quote(
            "nan",
            "Don't miss all the beautiful colors of the rainbow looking for that pot of gold."
        ),
        Quote(
            "Napoleon Hill",
            "Your big opportunity may be right where you are now."
        ),
        Quote(
            "Chinese proverb",
            "People who say it cannot be done should not interrupt those who are doing it."
        ),
        Quote(
            "Japanese proverb",
            "The day you decide to do it is your lucky day."
        ),
        Quote(
            "Cicero",
            "We must not say every mistake is a foolish one."
        ),
        Quote(
            "George Patton",
            "Accept challenges, so that you may feel the exhilaration of victory."
        ),
        Quote(
            "Anatole France",
            "It is better to understand a little than to misunderstand a lot."
        ),
        Quote(
            "nan",
            "You don't drown by falling in water. You drown by staying there."
        ),
        Quote(
            "nan",
            "Never be afraid to try, remember... Amateurs built the ark, Professionals built the Titanic."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Correction does much, but encouragement does more."
        ),
        Quote(
            "Epictetus",
            "Know, first, who you are, and then adorn yourself accordingly."
        ),
        Quote(
            "Oprah Winfrey",
            "The biggest adventure you can ever take is to live the life of your dreams."
        ),
        Quote(
            "Charles Swindoll",
            "Life is 10% what happens to you and 90% how you react to it."
        ),
        Quote(
            "Cynthia Ozick",
            "To want to be what one can be is purpose in life."
        ),
        Quote(
            "Dalai Lama",
            "Remember that sometimes not getting what you want is a wonderful stroke of luck."
        ),
        Quote(
            "Winston Churchill",
            "History will be kind to me for I intend to write it."
        ),
        Quote(
            "Wayne Dyer",
            "Our lives are a sum total of the choices we have made."
        ),
        Quote(
            "Leonardo da Vinci",
            "Time stays long enough for anyone who will use it."
        ),
        Quote(
            "nan",
            "Never tell me the sky's the limit when there are footprints on the moon."
        ),
        Quote(
            "Denis Waitley",
            "You must welcome change as the rule but not as your ruler."
        ),
        Quote(
            "Jim Rohn",
            "Give whatever you are doing and whoever you are with the gift of your attention."
        ),
        Quote(
            "Lena Horne",
            "Always be smarter than the people who hire you."
        ),
        Quote(
            "Tom Peters",
            "Formula for success: under promise and over deliver."
        ),
        Quote(
            "Henri Bergson",
            "The eye sees only what the mind is prepared to comprehend."
        ),
        Quote(
            "Lee Mildon",
            "People seldom notice old clothes if you wear a big smile."
        ),
        Quote(
            "Shakti Gawain",
            "The more light you allow within you, the brighter the world you live in will be."
        ),
        Quote(
            "Walter Anderson",
            "Nothing diminishes anxiety faster than action."
        ),
        Quote(
            "Andre Gide",
            "Man cannot discover new oceans unless he has the courage to lose sight of the shore."
        ),
        Quote(
            "Carl Jung",
            "Everything that irritates us about others can lead us to an understanding about ourselves."
        ),
        Quote(
            "Sun Tzu",
            "Can you imagine what I would do if I could do all I can?"
        ),
        Quote(
            "Benjamin Disraeli",
            "Ignorance never settle a question."
        ),
        Quote(
            "Paul Cezanne",
            "The awareness of our own strength makes us modest."
        ),
        Quote(
            "Confucius",
            "They must often change, who would be constant in happiness or wisdom."
        ),
        Quote(
            "Tom Krause",
            "There are no failures. Just experiences and your reactions to them."
        ),
        Quote(
            "Frank Tyger",
            "Your future depends on many things, but mostly on you."
        ),
        Quote(
            "Dorothy Thompson",
            "Fear grows in darkness; if you think theres a bogeyman around, turn on the light."
        ),
        Quote(
            "Shunryu Suzuki",
            "The most important point is to accept yourself and stand on your two feet."
        ),
        Quote(
            "Tomas Eliot",
            "Do not expect the world to look bright, if you habitually wear gray-brown glasses."
        ),
        Quote(
            "Donald Trump",
            "As long as your going to be thinking anyway, think big."
        ),
        Quote(
            "John Dewey",
            "Without some goals and some efforts to reach it, no man can live."
        ),
        Quote(
            "Richard Braunstein",
            "He who obtains has little. He who scatters has much."
        ),
        Quote(
            "George Orwell",
            "Myths which are believed in tend to become true."
        ),
        Quote(
            "Buddha",
            "The foot feels the foot when it feels the ground."
        ),
        Quote(
            "John Petit-Senn",
            "Not what we have but what we enjoy constitutes our abundance."
        ),
        Quote(
            "George Eliot",
            "It is never too late to be what you might have been."
        ),
        Quote(
            "Mary Wollstonecraft",
            "The beginning is always today."
        ),
        Quote(
            "Sheldon Kopp",
            "In the long run we get no more than we have been willing to risk giving."
        ),
        Quote(
            "Ralph Emerson",
            "Self-trust is the first secret of success."
        ),
        Quote(
            "Satchel Paige",
            "Don't look back. Something might be gaining on you."
        ),
        Quote(
            "Marcus Aurelius",
            "Look back over the past, with its changing empires that rose and fell, and you can foresee the future, too."
        ),
        Quote(
            "George Bernard Shaw",
            "A life spent making mistakes is not only more honourable, but more useful than a life spent doing nothing."
        ),
        Quote(
            "Epictetus",
            "Men are disturbed not by things, but by the view which they take of them."
        ),
        Quote(
            "Blaise Pascal",
            "Imagination disposes of everything; it creates beauty, justice, and happiness, which are everything in this world."
        ),
        Quote(
            "Mark Twain",
            "Happiness is a Swedish sunset, it is there for all, but most of us look the other way and lose it."
        ),
        Quote(
            "nan",
            "A smile is a light in the window of your face to show your heart is at home."
        ),
        Quote(
            "Byron Pulsifer",
            "Look forward to spring as a time when you can start to see what nature has to offer once again."
        ),
        Quote(
            "Billy Wilder",
            "Trust your own instinct. Your mistakes might as well be your own, instead of someone elses."
        ),
        Quote(
            "Blaise Pascal",
            "The least movement is of importance to all nature. The entire ocean is affected by a pebble."
        ),
        Quote(
            "Pablo Picasso",
            "I am always doing that which I can not do, in order that I may learn how to do it."
        ),
        Quote(
            "Niccolo Machiavelli",
            "Men in general judge more from appearances than from reality. All men have eyes, but few have the gift of penetration."
        ),
        Quote(
            "nan",
            "You may only be someone in the world, but to someone else, you may be the world."
        ),
        Quote(
            "Henry Ward Beecher",
            "Every artist dips his brush in his own soul, and paints his own nature into his pictures."
        ),
        Quote(
            "James Faust",
            "If you take each challenge one step at a time, with faith in every footstep, your strength and understanding will increase."
        ),
        Quote(
            "Denis Waitley",
            "Happiness cannot be travelled to, owned, earned, worn or consumed. Happiness is the spiritual experience of living every minute with love, grace and gratitude."
        ),
        Quote(
            "Hasidic saying",
            "Everyone should carefully observe which way his heart draws him, and then choose that way with all his strength."
        ),
        Quote(
            "Joseph Campbell",
            "When we quit thinking primarily about ourselves and our own self-preservation, we undergo a truly heroic transformation of consciousness."
        ),
        Quote(
            "Dhammapada",
            "Do not give your attention to what others do or fail to do; give it to what you do or fail to do."
        ),
        Quote(
            "Peter Drucker",
            "Follow effective action with quiet reflection. From the quiet reflection will come even more effective action."
        ),
        Quote(
            "Bernice Reagon",
            "Life's challenges are not supposed to paralyze you, they're supposed to help you discover who you are."
        ),
        Quote(
            "Fannie Hamer",
            "There is one thing you have got to learn about our movement. Three people are better than no people."
        ),
        Quote(
            "Ralph Waldo Emerson",
            "Happiness is a perfume you cannot pour on others without getting a few drops on yourself."
        ),
        Quote(
            "Byron Roberts",
            "It is not the mistake that has the most power, instead, it is learning from the mistake to advance your own attributes."
        ),
        Quote(
            "Thich Nhat Hanh",
            "The amount of happiness that you have depends on the amount of freedom you have in your heart."
        ),
        Quote(
            "Carl Jung",
            "Your vision will become clear only when you look into your heart. Who looks outside, dreams. Who looks inside, awakens."
        ),
        Quote(
            "Babatunde Olatunji",
            "Yesterday is history. Tomorrow is a mystery. And today? Today is a gift. That is why we call it the present."
        ),
        Quote(
            "Tony Robbins",
            "The way we communicate with others and with ourselves ultimately determines the quality of our lives."
        ),
        Quote(
            "Tony Blair",
            "Sometimes it is better to lose and do the right thing than to win and do the wrong thing."
        ),
        Quote(
            "Mother Teresa",
            "Let us always meet each other with smile, for the smile is the beginning of love."
        ),
        Quote(
            "nan",
            "A bend in the road is not the end of the road...unless you fail to make the turn."
        ),
        Quote(
            "Aristotle",
            "We are what we repeatedly do. Excellence, then, is not an act, but a habit."
        ),
        Quote(
            "Ray Bradbury",
            "Living at risk is jumping off the cliff and building your wings on the way down."
        ),
        Quote(
            "Albert Camus",
            "In the depth of winter, I finally learned that there was within me an invincible summer."
        ),
        Quote(
            "Madame de Stael",
            "Wit lies in recognizing the resemblance among things which differ and the difference between things which are alike."
        ),
        Quote(
            "Elbert Hubbard",
            "A failure is a man who has blundered but is not capable of cashing in on the experience."
        ),
        Quote(
            "Herbert Swope",
            "I cannot give you the formula for success, but I can give you the formula for failure: which is: Try to please everybody."
        ),
        Quote(
            "nan",
            "One who asks a question is a fool for five minutes; one who does not ask a question remains a fool forever."
        ),
        Quote(
            "Laozi",
            "The power of intuitive understanding will protect you from harm until the end of your days."
        ),
        Quote(
            "Abraham Lincoln",
            "The best thing about the future is that it only comes one day at a time."
        ),
        Quote(
            "Epictetus",
            "We have two ears and one mouth so that we can listen twice as much as we speak."
        ),
        Quote(
            "Byron Pulsifer",
            "Fear of failure is one attitude that will keep you at the same point in your life."
        ),
        Quote(
            "Ed Cunningham",
            "Friends are those rare people who ask how we are and then wait to hear the answer."
        ),
        Quote(
            "Pema Chodron",
            "If we learn to open our hearts, anyone, including the people who drive us crazy, can be our teacher."
        ),
        Quote(
            "Eleanor Roosevelt",
            "People grow through experience if they meet life honestly and courageously. This is how character is built."
        ),
        Quote(
            "Ralph Waldo Emerson",
            "A hero is no braver than an ordinary man, but he is braver five minutes longer."
        ),
        Quote(
            "Angela Schwindt",
            "While we try to teach our children all about life, our children teach us what life is all about."
        ),
        Quote(
            "Wayne Dyer",
            "When you dance, your purpose is not to get to a certain place on the floor. It's to enjoy each step along the way."
        ),
        Quote(
            "Dalai Lama",
            "Genuine love should first be directed at oneself, if we do not love ourselves, how can we love others?"
        ),
        Quote(
            "Orison Marden",
            "The Creator has not given you a longing to do that which you have no ability to do."
        ),
        Quote(
            "Sam Levenson",
            "It's so simple to be wise. Just think of something stupid to say and then don't say it."
        ),
        Quote(
            "Dalai Lama",
            "Consider that not only do negative thoughts and emotions destroy our experience of peace, they also undermine our health."
        ),
        Quote(
            "Doris Mortman",
            "Until you make peace with who you are, you will never be content with what you have."
        ),
        Quote(
            "Buddha",
            "No one saves us but ourselves. No one can and no one may. We ourselves must walk the path."
        ),
        Quote(
            "Henry Miller",
            "The moment one gives close attention to anything, it becomes a mysterious, awesome, indescribably magnificent world in itself."
        ),
        Quote(
            "Mohandas Gandhi",
            "Happiness is when what you think, what you say, and what you do are in harmony."
        ),
        Quote(
            "Dalai Lama",
            "The greatest antidote to insecurity and the sense of fear is compassion, it brings one back to the basis of one's inner strength"
        ),
        Quote(
            "nan",
            "Courage is the discovery that you may not win, and trying when you know you can lose."
        ),
        Quote(
            "Byron Pulsifer",
            "To be thoughtful and kind only takes a few seconds compared to the timeless hurt caused by one rude gesture."
        ),
        Quote(
            "Mortimer Adler",
            "The purpose of learning is growth, and our minds, unlike our bodies, can continue growing as we continue to live."
        ),
        Quote(
            "Buddha",
            "When you realize how perfect everything is you will tilt your head back and laugh at the sky."
        ),
        Quote(
            "Mary Kay Ash",
            "For every failure, there's an alternative course of action. You just have to find it. When you come to a roadblock, take a detour."
        ),
        Quote(
            "Walter Linn",
            "It is surprising what a man can do when he has to, and how little most men will do when they don't have to."
        ),
        Quote(
            "Tenzin Gyatso",
            "To be aware of a single shortcoming in oneself is more useful than to be aware of a thousand in someone else."
        ),
        Quote(
            "Edmund Burke",
            "Nobody made a greater mistake than he who did nothing because he could do only a little."
        ),
        Quote(
            "Albert Schweitzer",
            "Constant kindness can accomplish much. As the sun makes ice melt, kindness causes misunderstanding, mistrust, and hostility to evaporate."
        ),
        Quote(
            "Rene Descartes",
            "The greatest minds are capable of the greatest vices as well as of the greatest virtues."
        ),
        Quote(
            "Albert Einstein",
            "A man should look for what is, and not for what he thinks should be."
        ),
        Quote(
            "William Channing",
            "Difficulties are meant to rouse, not discourage. The human spirit is to grow strong by conflict."
        ),
        Quote(
            "Byron Pulsifer",
            "If you have no respect for your own values how can you be worthy of respect from others."
        ),
        Quote(
            "Alphonse Karr",
            "Some people are always grumbling because roses have thorns; I am thankful that thorns have roses."
        ),
        Quote(
            "W. H. Auden",
            "To choose what is difficult all ones days, as if it were easy, that is faith."
        ),
        Quote(
            "Lou Holtz",
            "Ability is what you're capable of doing. Motivation determines what you do.Attitude determines how well you do it."
        ),
        Quote(
            "Thomas Carlyle",
            "Do not be embarrassed by your mistakes. Nothing can teach us better than our understanding of them. This is one of the best ways of self-education."
        ),
        Quote(
            "Buddha",
            "Thousands of candles can be lighted from a single candle, and the life of the candle will not be shortened. Happiness never decreases by being shared."
        ),
        Quote(
            "Michel de Montaigne",
            "I care not so much what I am to others as what I am to myself. I will be rich by myself, and not by borrowing."
        ),
        Quote(
            "Margaret Laurence",
            "Know that although in the eternal scheme of things you are small, you are also unique and irreplaceable, as are all your fellow humans everywhere in the world."
        ),
        Quote(
            "Napoleon Bonaparte",
            "To do all that one is able to do, is to be a man; to do all that one would like to do, is to be a god."
        ),
        Quote(
            "Ajahn Chah",
            "If you let go a little, you will have a little peace. If you let go a lot, you will have a lot of peace."
        ),
        Quote(
            "Dalai Lama",
            "There is no need for temples, no need for complicated philosophies. My brain and my heart are my temples; my philosophy is kindness."
        ),
        Quote(
            "Vincent Lombardi",
            "The spirit, the will to win, and the will to excel, are the things that endure. These qualities are so much more important than the events that occur."
        ),
        Quote(
            "Jean-Paul Sartre",
            "Man is not sum of what he has already, but rather the sum of what he does not yet have, of what he could have."
        ),
        Quote(
            "Richard Bach",
            "Don't believe what your eyes are telling you. All they show is limitation. Look with your understanding, find out what you already know, and you'll see the way to fly."
        ),
        Quote(
            "Elisabeth Kubler-Ross",
            "I believe that we are solely responsible for our choices, and we have to accept the consequences of every deed, word, and thought throughout our lifetime."
        ),
        Quote(
            "Byron Pulsifer",
            "Wishes can be your best avenue of getting what you want when you turn wishes into action. Action moves your wish to the forefront from thought to reality."
        ),
        Quote(
            "Kahlil Gibran",
            "To understand the heart and mind of a person, look not at what he has already achieved, but at what he aspires to do."
        ),
        Quote(
            "Bernard Shaw",
            "I am of the opinion that my life belongs to the community, and as long as I live it is my privilege to do for it whatever I can."
        ),
        Quote(
            "Albert Einstein",
            "Imagination is more important than knowledge. For while knowledge defines all we currently know and understand, imagination points to all we might yet discover and create."
        ),
        Quote(
            "Confucius",
            "When you see a good person, think of becoming like him. When you see someone not so good, reflect on your own weak points."
        ),
        Quote(
            "Anne Lindbergh",
            "If one is estranged from oneself, then one is estranged from others too. If one is out of touch with oneself, then one cannot touch others."
        ),
        Quote(
            "Dale Carnegie",
            "Most of the important things in the world have been accomplished by people who have kept on trying when there seemed to be no hope at all."
        ),
        Quote(
            "John Lennon",
            "You may say Im a dreamer, but Im not the only one, I hope someday you will join us, and the world will live as one."
        ),
        Quote(
            "Nathaniel Hawthorne",
            "Happiness is as a butterfly which, when pursued, is always beyond our grasp, but which if you will sit down quietly, may alight upon you."
        ),
        Quote(
            "Buddha",
            "He who experiences the unity of life sees his own Self in all beings, and all beings in his own Self, and looks on everything with an impartial eye."
        ),
        Quote(
            "Buddha",
            "In the sky, there is no distinction of east and west; people create distinctions out of their own minds and then believe them to be true."
        ),
        Quote(
            "Caroline Myss",
            "You cannot change anything in your life with intention alone, which can become a watered-down, occasional hope that you'll get to tomorrow. Intention without action is useless."
        ),
        Quote(
            "Winston Churchill",
            "Before you can inspire with emotion, you must be swamped with it yourself. Before you can move their tears, your own must flow. To convince them, you must yourself believe."
        ),
        Quote(
            "William James",
            "The greatest discovery of our generation is that human beings can alter their lives by altering their attitudes of mind. As you think, so shall you be."
        ),
        Quote(
            "Henry David Thoreau",
            "If one advances confidently in the direction of his dream, and endeavours to live the life which he had imagines, he will meet with a success unexpected in common hours."
        ),
        Quote(
            "Pearl Buck",
            "The secret of joy in work is contained in one word, excellence. To know how to do something well is to enjoy it."
        ),
        Quote(
            "Confucius",
            "When you meet someone better than yourself, turn your thoughts to becoming his equal. When you meet someone not as good as you are, look within and examine your own self."
        ),
        Quote(
            "Uta Hagen",
            "We must overcome the notion that we must be regular. It robs you of the chance to be extraordinary and leads you to the mediocre."
        ),
        Quote(
            "Orison Marden",
            "Most of our obstacles would melt away if, instead of cowering before them, we should make up our minds to walk boldly through them."
        ),
        Quote(
            "Victor Frankl",
            "Everything can be taken from a man but ... the last of the human freedoms, to choose ones attitude in any given set of circumstances, to choose ones own way."
        ),
        Quote(
            "Edward de Bono",
            "It is better to have enough ideas for some of them to be wrong, than to be always right by having no ideas at all."
        ),
        Quote(
            "Abraham Lincoln",
            "Character is like a tree and reputation like a shadow. The shadow is what we think of it; the tree is the real thing."
        ),
        Quote(
            "Lao Tzu",
            "By letting it go it all gets done. The world is won by those who let it go. But when you try and try. The world is beyond the winning."
        ),
        Quote(
            "Amy Tan",
            "I am like a falling star who has finally found her place next to another in a lovely constellation, where we will sparkle in the heavens forever."
        ),
        Quote(
            "Epictetus",
            "Not every difficult and dangerous thing is suitable for training, but only that which is conducive to success in achieving the object of our effort."
        ),
        Quote(
            "Stephen Covey",
            "We are not animals. We are not a product of what has happened to us in our past. We have the power of choice."
        ),
        Quote(
            "Paul Graham",
            "The most dangerous way to lose time is not to spend it having fun, but to spend it doing fake work. When you spend time having fun, you know you're being self-indulgent."
        ),
        Quote(
            "Buddha",
            "Thousands of candles can be lit from a single, and the life of the candle will not be shortened. Happiness never decreases by being shared."
        ),
        Quote(
            "Chuck Norris",
            "A lot of times people look at the negative side of what they feel they can't do. I always look on the positive side of what I can do."
        ),
        Quote(
            "Amiel",
            "Without passion man is a mere latent force and possibility, like the flint which awaits the shock of the iron before it can give forth its spark."
        ),
        Quote(
            "Amy Bloom",
            "Love at first sight is easy to understand; its when two people have been looking at each other for a lifetime that it becomes a miracle."
        ),
        Quote(
            "Keshavan Nair",
            "With courage you will dare to take risks, have the strength to be compassionate, and the wisdom to be humble. Courage is the foundation of integrity."
        ),
        Quote(
            "Margaret Smith",
            "The right way is not always the popular and easy way. Standing for right when it is unpopular is a true test of moral character."
        ),
        Quote(
            "Frederick Douglass",
            "I prefer to be true to myself, even at the hazard of incurring the ridicule of others, rather than to be false, and to incur my own abhorrence."
        ),
        Quote(
            "Helen Keller",
            "No pessimist ever discovered the secrets of the stars, or sailed to an uncharted land, or opened a new heaven to the human spirit."
        ),
        Quote(
            "Marcus Aurelius",
            "When you arise in the morning, think of what a precious privilege it is to be alive, to breathe, to think, to enjoy, to love."
        ),
        Quote(
            "Helen Keller",
            "Character cannot be developed in ease and quiet. Only through experience of trial and suffering can the soul be strengthened, vision cleared, ambition inspired, and success achieved."
        ),
        Quote(
            "Oprah Winfrey",
            "Although there may be tragedy in your life, there's always a possibility to triumph. It doesn't matter who you are, where you come from. The ability to triumph begins with you. Always."
        ),
        Quote(
            "Ingrid Bergman",
            "You must train your intuition, you must trust the small voice inside you which tells you exactly what to say, what to decide."
        ),
        Quote(
            "Marcus Aurelius",
            "Accept the things to which fate binds you, and love the people with whom fate brings you together, but do so with all your heart."
        ),
        Quote(
            "John Kennedy",
            "Let us resolve to be masters, not the victims, of our history, controlling our own destiny without giving way to blind suspicions and emotions."
        ),
        Quote(
            "Marie Curie",
            "Nothing in life is to be feared, it is only to be understood. Now is the time to understand more, so that we may fear less."
        ),
        Quote(
            "Anne Frank",
            "Parents can only give good advice or put them on the right paths, but the final forming of a persons character lies in their own hands."
        ),
        Quote(
            "Byron Pulsifer",
            "Adversity isn't set against you to fail; adversity is a way to build your character so that you can succeed over and over again through perseverance."
        ),
        Quote(
            "Robert Fulghum",
            "If you break your neck, if you have nothing to eat, if your house is on fire, then you got a problem. Everything else is inconvenience."
        ),
        Quote(
            "Albert Schweitzer",
            "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful."
        ),
        Quote(
            "Albert Einstein",
            "If A is success in life, then A equals x plus y plus z. Work is x; y is play; and z is keeping your mouth shut."
        ),
        Quote(
            "Thornton Wilder",
            "My advice to you is not to inquire why or whither, but just enjoy your ice cream while its on your plate, that's my philosophy."
        ),
        Quote(
            "John Dewey",
            "Conflict is the gadfly of thought. It stirs us to observation and memory. It instigates to invention. It shocks us out of sheeplike passivity, and sets us at noting and contriving."
        ),
        Quote(
            "Lao Tzu",
            "He who conquers others is strong; He who conquers himself is mighty."
        ),
        Quote(
            "Wayne Dyer",
            "Anything you really want, you can attain, if you really go after it."
        ),
        Quote(
            "John Dewey",
            "Arriving at one point is the starting point to another."
        ),
        Quote(
            "James Oppenheim",
            "The foolish man seeks happiness in the distance, the wise grows it under his feet."
        ),
        Quote(
            "Martha Washington",
            "The greatest part of our happiness depends on our dispositions, not our circumstances."
        ),
        Quote(
            "Margaret Bonnano",
            "It is only possible to live happily ever after on a day to day basis."
        ),
        Quote(
            "Goethe",
            "A man sees in the world what he carries in his heart."
        ),
        Quote(
            "Benjamin Disraeli",
            "Action may not always bring happiness, but there is no happiness without action."
        ),
        Quote(
            "Joe Paterno",
            "Believe deep down in your heart that you're destined to do great things."
        ),
        Quote(
            "Richard Bach",
            "Sooner or later, those who win are those who think they can."
        ),
        Quote(
            "Tony Robbins",
            "The only limit to your impact is your imagination and commitment."
        ),
        Quote(
            "Cathy Pulsifer",
            "You are special, you are unique, you are the best!"
        ),
        Quote(
            "William Arthur Ward",
            "Four steps to achievement: Plan purposefully. Prepare prayerfully. Proceed positively. Pursue persistently."
        ),
        Quote(
            "Bruce Lee",
            "To know oneself is to study oneself in action with another person."
        ),
        Quote(
            "Bishop Desmond Tutu",
            "We must not allow ourselves to become like the system we oppose."
        ),
        Quote(
            "Thich Nhat Hanh",
            "Smile, breathe and go slowly."
        ),
        Quote(
            "Albert Einstein",
            "Reality is merely an illusion, albeit a very persistent one."
        ),
        Quote(
            "Franklin Roosevelt",
            "When you come to the end of your rope, tie a knot and hang on."
        ),
        Quote(
            "Buddha",
            "Always be mindful of the kindness and not the faults of others."
        ),
        Quote(
            "Carl Jung",
            "Everything that irritates us about others can lead us to an understanding of ourselves."
        ),
        Quote(
            "Dale Carnegie",
            "When fate hands us a lemon, lets try to make lemonade."
        ),
        Quote(
            "Mohandas Gandhi",
            "The weak can never forgive. Forgiveness is the attribute of the strong."
        ),
        Quote(
            "Chanakya",
            "A man is great by deeds, not by birth."
        ),
        Quote(
            "Dale Carnegie",
            "Success is getting what you want. Happiness is wanting what you get."
        ),
        Quote(
            "nan",
            "Put your future in good hands, your own."
        ),
        Quote(
            "Byron Pulsifer",
            "Truth isn't all about what actually happens but more about how what has happened is interpreted."
        ),
        Quote(
            "nan",
            "A good rest is half the work."
        ),
        Quote(
            "Robert Stevenson",
            "Don't judge each day by the harvest you reap but by the seeds that you plant."
        ),
        Quote(
            "Demosthenes",
            "Small opportunities are often the beginning of great enterprises."
        ),
        Quote(
            "Gail Sheehy",
            "To be tested is good. The challenged life may be the best therapist."
        ),
        Quote(
            "English proverb",
            "Take heed: you do not find what you do not seek."
        ),
        Quote(
            "Richard Bach",
            "Happiness is the reward we get for living to the highest right we know."
        ),
        Quote(
            "Cervantes",
            "Be slow of tongue and quick of eye."
        ),
        Quote(
            "Mohandas Gandhi",
            "Freedom is not worth having if it does not connote freedom to err."
        ),
        Quote(
            "John Locke",
            "I have always thought the actions of men the best interpreters of their thoughts."
        ),
        Quote(
            "Soren Kierkegaard",
            "To dare is to lose ones footing momentarily. To not dare is to lose oneself."
        ),
        Quote(
            "David Eddings",
            "No day in which you learn something is a complete loss."
        ),
        Quote(
            "Albert Einstein",
            "Peace cannot be kept by force. It can only be achieved by understanding."
        ),
        Quote(
            "David McCullough",
            "Real success is finding your lifework in the work that you love."
        ),
        Quote(
            "Buddha",
            "Better than a thousand hollow words, is one word that brings peace."
        ),
        Quote(
            "nan",
            "All the flowers of all the tomorrows are in the seeds of today."
        ),
        Quote(
            "Joseph Campbell",
            "Your sacred space is where you can find yourself again and again."
        ),
        Quote(
            "Bruce Lee",
            "As you think, so shall you become."
        ),
        Quote(
            "William Blake",
            "In seed time learn, in harvest teach, in winter enjoy."
        ),
        Quote(
            "Cheng Yen",
            "Happiness does not come from having much, but from being attached to little."
        ),
        Quote(
            "Richard Bach",
            "Every gift from a friend is a wish for your happiness."
        ),
        Quote(
            "Ralph Emerson",
            "Go put your creed into the deed. Nor speak with double tongue."
        ),
        Quote(
            "Euripides",
            "The wisest men follow their own direction."
        ),
        Quote(
            "William Sloane Coffin",
            "Hope arouses, as nothing else can arouse, a passion for the possible."
        ),
        Quote(
            "Confucius",
            "Everything has beauty, but not everyone sees it."
        ),
        Quote(
            "Pema Chodron",
            "Nothing ever goes away until it has taught us what we need to know."
        ),
        Quote(
            "Maya Angelou",
            "When you learn, teach. When you get, give."
        ),
        Quote(
            "Dorothy Thompson",
            "Only when we are no longer afraid do we begin to live."
        ),
        Quote(
            "Andy Rooney",
            "If you smile when no one else is around, you really mean it."
        ),
        Quote(
            "Martin Luther King, Jr.",
            "Love is the only force capable of transforming an enemy into friend."
        ),
        Quote(
            "Carl Jung",
            "In all chaos there is a cosmos, in all disorder a secret order."
        ),
        Quote(
            "nan",
            "A man is not where he lives but where he loves."
        ),
        Quote(
            "Winston Churchill",
            "The price of greatness is responsibility."
        ),
        Quote(
            "Paul Tillich",
            "Decision is a risk rooted in the courage of being free."
        ),
        Quote(
            "William Burroughs",
            "Your mind will answer most questions if you learn to relax and wait for the answer."
        ),
        Quote(
            "nan",
            "The world doesn't happen to you it happens from you."
        ),
        Quote(
            "Albert Einstein",
            "We cannot solve our problems with the same thinking we used when we created them."
        ),
        Quote(
            "nan",
            "More powerful than the will to win is the courage to begin."
        ),
        Quote(
            "Richard Bach",
            "Learning is finding out what you already know."
        ),
        Quote(
            "Alfred Painter",
            "Saying thank you is more than good manners. It is good spirituality."
        ),
        Quote(
            "Lao Tzu",
            "Silence is a source of great strength."
        ),
        Quote(
            "Anne Lamott",
            "Joy is the best makeup."
        ),
        Quote(
            "Seneca",
            "There is no great genius without some touch of madness."
        ),
        Quote(
            "Buddha",
            "A jug fills drop by drop."
        ),
        Quote(
            "Doris Mortman",
            "Until you make peace with who you are, you'll never be content with what you have."
        ),
        Quote(
            "Ralph Emerson",
            "We aim above the mark to hit the mark."
        ),
        Quote(
            "Catherine Pulsifer",
            "Being angry never solves anything."
        ),
        Quote(
            "Orison Marden",
            "All men who have achieved great things have been great dreamers."
        ),
        Quote(
            "Arthur Conan Doyle",
            "Mediocrity knows nothing higher than itself, but talent instantly recognizes genius."
        ),
        Quote(
            "Walter Lippmann",
            "Where all think alike, no one thinks very much."
        ),
        Quote(
            "Marcus Aurelius",
            "Everything that exists is in a manner the seed of that which will be."
        ),
        Quote(
            "Marie Curie",
            "Be less curious about people and more curious about ideas."
        ),
        Quote(
            "Charles Perkhurst",
            "The heart has eyes which the brain knows nothing of."
        ),
        Quote(
            "Robert Kennedy",
            "Only those who dare to fail greatly can ever achieve greatly."
        ),
        Quote(
            "Richard Whately",
            "Lose an hour in the morning, and you will spend all day looking for it."
        ),
        Quote(
            "Bruce Lee",
            "Mistakes are always forgivable, if one has the courage to admit them."
        ),
        Quote(
            "William Shakespeare",
            "Go to your bosom: Knock there, and ask your heart what it doth know."
        ),
        Quote(
            "Dalai Lama",
            "Happiness mainly comes from our own attitude, rather than from external factors."
        ),
        Quote(
            "Lao Tzu",
            "If you do not change direction, you may end up where you are heading."
        ),
        Quote(
            "nan",
            "What we see is mainly what we look for."
        ),
        Quote(
            "Marsha Petrie Sue",
            "Stay away from what might have been and look at what will be."
        ),
        Quote(
            "William James",
            "Act as if what you do makes a difference. It does."
        ),
        Quote(
            "Byron Pulsifer",
            "Passion creates the desire for more and action fuelled by passion creates a future."
        ),
        Quote(
            "Alexander Pope",
            "Do good by stealth, and blush to find it fame."
        ),
        Quote(
            "Napoleon Hill",
            "Opportunity often comes disguised in the form of misfortune, or temporary defeat."
        ),
        Quote(
            "Thomas Jefferson",
            "Don't talk about what you have done or what you are going to do."
        ),
        Quote(
            "Seneca",
            "Most powerful is he who has himself in his own power."
        ),
        Quote(
            "Bernard Shaw",
            "We don't stop playing because we grow old; we grow old because we stop playing."
        ),
        Quote(
            "Byron Pulsifer",
            "Experience can only be gained by doing not by thinking or dreaming."
        ),
        Quote(
            "Mark Twain",
            "Always tell the truth. That way, you don't have to remember what you said."
        ),
        Quote(
            "Lao Tzu",
            "From wonder into wonder existence opens."
        ),
        Quote(
            "Napoleon Bonaparte",
            "He who fears being conquered is sure of defeat."
        ),
        Quote(
            "John Lennon",
            "Life is what happens while you are making other plans."
        ),
        Quote(
            "Wayne Dyer",
            "Doing what you love is the cornerstone of having abundance in your life."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Kindness is the golden chain by which society is bound together."
        ),
        Quote(
            "Nietzsche",
            "You need chaos in your soul to give birth to a dancing star."
        ),
        Quote(
            "Byron Pulsifer",
            "It can't be spring if your heart is filled with past failures."
        ),
        Quote(
            "Brendan Francis",
            "No yesterdays are ever wasted for those who give themselves to today."
        ),
        Quote(
            "Tom Krause",
            "There are no failures, just experiences and your reactions to them."
        ),
        Quote(
            "Pablo Picasso",
            "Action is the foundational key to all success."
        ),
        Quote(
            "Abraham Maslow",
            "What is necessary to change a person is to change his awareness of himself."
        ),
        Quote(
            "Zig Ziglar",
            "Positive thinking will let you do everything better than negative thinking will."
        ),
        Quote(
            "Mother Teresa",
            "We shall never know all the good that a simple smile can do."
        ),
        Quote(
            "Frances de Sales",
            "Nothing is so strong as gentleness. Nothing is so gentle as real strength."
        ),
        Quote(
            "Ralph Waldo Emerson",
            "Imagination is not a talent of some men but is the health of every man."
        ),
        Quote(
            "Kenji Miyazawa",
            "We must embrace pain and burn it as fuel for our journey."
        ),
        Quote(
            "nan",
            "Don't wait for people to be friendly. Show them how."
        ),
        Quote(
            "Chinese proverb",
            "A gem cannot be polished without friction, nor a man perfected without trials."
        ),
        Quote(
            "George Matthew Adams",
            "Each day can be one of triumph if you keep up your interests."
        ),
        Quote(
            "Robert M. Pirsig",
            "The place to improve the world is first in one's own heart and head and hands."
        ),
        Quote(
            "Winston Churchill",
            "The pessimist sees difficulty in every opportunity. The optimist sees the opportunity in every difficulty."
        ),
        Quote(
            "Albert Gray",
            "Winners have simply formed the habit of doing things losers don't like to do."
        ),
        Quote(
            "Ralph Emerson",
            "Nature is a mutable cloud which is always and never the same."
        ),
        Quote(
            "Grandma Moses",
            "Life is what you make of it. Always has been, always will be."
        ),
        Quote(
            "Swedish proverb",
            "Worry often gives a small thing a big shadow."
        ),
        Quote(
            "Confucius",
            "I want you to be everything that's you, deep at the center of your being."
        ),
        Quote(
            "William Shakespeare",
            "We know what we are, but know not what we may be."
        ),
        Quote(
            "Jean-Paul Sartre",
            "Freedom is what you do with what's been done to you."
        ),
        Quote(
            "Felix Adler",
            "The truth which has made us free will in the end make us glad also."
        ),
        Quote(
            "Joseph Joubert",
            "He who has imagination without learning has wings but no feet."
        ),
        Quote(
            "Elizabeth Browning",
            "Whoso loves, believes the impossible."
        ),
        Quote(
            "Ella Fitzgerald",
            "It isn't where you come from, it's where you're going that counts."
        ),
        Quote(
            "Pema Chodron",
            "The greatest obstacle to connecting with our joy is resentment."
        ),
        Quote(
            "C. Pulsifer",
            "When anger use your energy to do something productive."
        ),
        Quote(
            "Blaise Pascal",
            "We are all something, but none of us are everything."
        ),
        Quote(
            "Albert Einstein",
            "If you can't explain it simply, you don't understand it well enough."
        ),
        Quote(
            "Marcus Aurelius",
            "He who lives in harmony with himself lives in harmony with the world."
        ),
        Quote(
            "Lao Tzu",
            "He who knows himself is enlightened."
        ),
        Quote(
            "Ralph Emerson",
            "Build a better mousetrap and the world will beat a path to your door."
        ),
        Quote(
            "Abraham Lincoln",
            "As our case is new, we must think and act anew."
        ),
        Quote(
            "Mother Teresa",
            "If you can't feed a hundred people, then feed just one."
        ),
        Quote(
            "Robert Frost",
            "In three words I can sum up everything Ive learned about life: it goes on."
        ),
        Quote(
            "nan",
            "Don't let today's disappointments cast a shadow on tomorrow's dreams."
        ),
        Quote(
            "Tony Robbins",
            "You always succeed in producing a result."
        ),
        Quote(
            "Wayne Dyer",
            "Everything you are against weakens you. Everything you are for empowers you."
        ),
        Quote(
            "Fran Watson",
            "As we risk ourselves, we grow. Each new experience is a risk."
        ),
        Quote(
            "Mary Almanac",
            "Who we are never changes. Who we think we are does."
        ),
        Quote(
            "Elbert Hubbard",
            "The final proof of greatness lies in being able to endure criticism without resentment."
        ),
        Quote(
            "Victor Hugo",
            "An invasion of armies can be resisted, but not an idea whose time has come."
        ),
        Quote(
            "nan",
            "Never let lack of money interfere with having fun."
        ),
        Quote(
            "Ralph Marston",
            "Excellence is not a skill. It is an attitude."
        ),
        Quote(
            "Lewis Cass",
            "People may doubt what you say, but they will believe what you do."
        ),
        Quote(
            "Thomas Paine",
            "The most formidable weapon against errors of every kind is reason."
        ),
        Quote(
            "Danilo Dolci",
            "It's important to know that words don't move mountains. Work, exacting work moves mountains."
        ),
        Quote(
            "Franz Liszt",
            "Beware of missing chances; otherwise it may be altogether too late some day."
        ),
        Quote(
            "Buddha",
            "You only lose what you cling to."
        ),
        Quote(
            "Corita Kent",
            "Life is a succession of moments. To live each one is to succeed."
        ),
        Quote(
            "Ralph Waldo Emerson",
            "Most of the shadows of life are caused by standing in our own sunshine."
        ),
        Quote(
            "Plato",
            "Good actions give strength to ourselves and inspire good actions in others."
        ),
        Quote(
            "Antoine de Saint-Exupery",
            "I know but one freedom and that is the freedom of the mind."
        ),
        Quote(
            "Albert Einstein",
            "In the middle of every difficulty lies opportunity."
        ),
        Quote(
            "Buddha",
            "Every human being is the author of his own health or disease."
        ),
        Quote(
            "Mark Twain",
            "When in doubt, tell the truth."
        ),
        Quote(
            "John Dewey",
            "Every great advance in science has issued from a new audacity of the imagination."
        ),
        Quote(
            "Napoleon Hill",
            "The ladder of success is never crowded at the top."
        ),
        Quote(
            "nan",
            "He who has health has hope, and he who has hope has everything."
        ),
        Quote(
            "Maya Angelou",
            "All great achievements require time."
        ),
        Quote(
            "Alice Walker",
            "No person is your friend who demands your silence, or denies your right to grow."
        ),
        Quote(
            "Charles Chesnutt",
            "Impossibilities are merely things which we have not yet learned."
        ),
        Quote(
            "Japanese proverb",
            "Vision without action is a daydream. Action without vision is a nightmare."
        ),
        Quote(
            "Confucius",
            "The Superior Man is aware of Righteousness, the inferior man is aware of advantage."
        ),
        Quote(
            "Elizabeth Kenny",
            "He who angers you conquers you."
        ),
        Quote(
            "Winston Churchill",
            "I never worry about action, but only inaction."
        ),
        Quote(
            "Epictetus",
            "No man is free who is not master of himself."
        ),
        Quote(
            "Aristotle",
            "Those that know, do. Those that understand, teach."
        ),
        Quote(
            "Thich Nhat Hanh",
            "If we are not fully ourselves, truly in the present moment, we miss everything."
        ),
        Quote(
            "Aesop",
            "No act of kindness, no matter how small, is ever wasted."
        ),
        Quote(
            "Channing",
            "Every man is a volume if you know how to read him."
        ),
        Quote(
            "nan",
            "The difficulties of life are intended to make us better, not bitter."
        ),
        Quote(
            "Henry Ford",
            "Quality means doing it right when no one is looking."
        ),
        Quote(
            "nan",
            "Change your words. Change your world."
        ),
        Quote(
            "Lao Tzu",
            "Great acts are made up of small deeds."
        ),
        Quote(
            "Mal Pancoast",
            "The odds of hitting your target go up dramatically when you aim at it."
        ),
        Quote(
            "nan",
            "Open minds lead to open doors."
        ),
        Quote(
            "Virgil",
            "They can do all because they think they can."
        ),
        Quote(
            "Donald Trump",
            "You have to think anyway, so why not think big?"
        ),
        Quote(
            "Edward Young",
            "On every thorn, delightful wisdom grows, In every rill a sweet instruction flows."
        ),
        Quote(
            "Buddha",
            "Your body is precious. It is our vehicle for awakening. Treat it with care."
        ),
        Quote(
            "Claire Charmont",
            "The one who always loses, is the only person who gets the reward."
        ),
        Quote(
            "Pema Chodron",
            "The future is completely open, and we are writing it moment to moment."
        ),
        Quote(
            "nan",
            "Each time we face a fear, we gain strength, courage, and confidence in the doing."
        ),
        Quote(
            "Richard Bach",
            "Ask yourself the secret of your success. Listen to your answer, and practice it."
        ),
        Quote(
            "Sinvyest Tan",
            "Don't frown because you never know who is falling in love with your smile."
        ),
        Quote(
            "Joyce Brothers",
            "Trust your hunches. They're usually based on facts filed away just below the conscious level."
        ),
        Quote(
            "Ralph Emerson",
            "Nothing is at last sacred but the integrity of your own mind."
        ),
        Quote(
            "Anthony D'Angelo",
            "Listen to your intuition. It will tell you everything you need to know."
        ),
        Quote(
            "Anais Nin",
            "The personal life deeply lived always expands into truths beyond itself."
        ),
        Quote(
            "Eckhart Tolle",
            "Whenever something negative happens to you, there is a deep lesson concealed within it."
        ),
        Quote(
            "Goethe",
            "What is not started today is never finished tomorrow."
        ),
        Quote(
            "Gordon Hinckley",
            "Our kindness may be the most persuasive argument for that which we believe."
        ),
        Quote(
            "Buddha",
            "Chaos is inherent in all compounded things. Strive on with diligence."
        ),
        Quote(
            "Abraham Lincoln",
            "Be sure you put your feet in the right place, then stand firm."
        ),
        Quote(
            "Ralph Emerson",
            "Nothing great was ever achieved without enthusiasm."
        ),
        Quote(
            "Richard Bach",
            "The meaning I picked, the one that changed my life: Overcome fear, behold wonder."
        ),
        Quote(
            "Plutarch",
            "Know how to listen, and you will profit even from those who talk badly."
        ),
        Quote(
            "Edmond Rostand",
            "A man is not old as long as he is seeking something."
        ),
        Quote(
            "Ymber Delecto",
            "The time you think you're missing, misses you too."
        ),
        Quote(
            "Michael Vance",
            "Life is not measured by the breaths you take, but by its breathtaking moments."
        ),
        Quote(
            "Sophocles",
            "Much wisdom often goes with fewer words."
        ),
        Quote(
            "Bruce Lee",
            "If you love life, don't waste time, for time is what life is made up of."
        ),
        Quote(
            "Samuel Taylor Coleridge",
            "Imagination is the living power and prime agent of all human perception."
        ),
        Quote(
            "Naomi Williams",
            "It is impossible to feel grateful and depressed in the same moment."
        ),
        Quote(
            "Frederick Wilcox",
            "Progress always involves risks. You can't steal second base and keep your foot on first."
        ),
        Quote(
            "Simone Weil",
            "Liberty, taking the word in its concrete sense, consists in the ability to choose."
        ),
        Quote(
            "John Dryden",
            "A thing well said will be wit in all languages."
        ),
        Quote(
            "Og Mandino",
            "Always do your best. What you plant now, you will harvest later."
        ),
        Quote(
            "Forrest Gump",
            "My mama always said: life's like a box of chocolate, you never know what you gonna get."
        ),
        Quote(
            "Jean Lacordaire",
            "We are the leaves of one branch, the drops of one sea, the flowers of one garden."
        ),
        Quote(
            "nan",
            "If you come to a fork in the road, take it."
        ),
        Quote(
            "Moliere",
            "It is not only for what we do that we are held responsible, but also for what we do not do."
        ),
        Quote(
            "nan",
            "Nobody can do everything, but everybody can do something."
        ),
        Quote(
            "Napoleon Hill",
            "The world has the habit of making room for the man whose actions show that he knows where he is going."
        ),
        Quote(
            "Heraclitus",
            "You cannot step twice into the same river, for other waters are continually flowing in."
        ),
        Quote(
            "Booker Washington",
            "Excellence is to do a common thing in an uncommon way."
        ),
        Quote(
            "Buddha",
            "No matter how hard the past, you can always begin again."
        ),
        Quote(
            "Pablo Picasso",
            "I begin with an idea and then it becomes something else."
        ),
        Quote(
            "Mark Twain",
            "Whoever is happy will make others happy, too."
        ),
        Quote(
            "Buddha",
            "Your work is to discover your work and then with all your heart to give yourself to it."
        ),
        Quote(
            "Epictetus",
            "It's not what happens to you, but how you react to it that matters."
        ),
        Quote(
            "Woody Guthrie",
            "Take it easy, but take it."
        ),
        Quote(
            "Benjamin Disraeli",
            "Never apologize for showing feeling. When you do so, you apologize for truth."
        ),
        Quote(
            "Ovid",
            "Take rest; a field that has rested gives a bountiful crop."
        ),
        Quote(
            "Anais Nin",
            "Age does not protect you from love. But love, to some extent, protects you from age."
        ),
        Quote(
            "Forrest Church",
            "Do what you can. Want what you have. Be who you are."
        ),
        Quote(
            "Coco Chanel",
            "There are people who have money and people who are rich."
        ),
        Quote(
            "nan",
            "Why worry about tomorrow, when today is all we have?"
        ),
        Quote(
            "Ambrose Bierce",
            "Speak when you are angry and you will make the best speech you will ever regret."
        ),
        Quote(
            "Henry Thoreau",
            "Things do not change, we change."
        ),
        Quote(
            "Mark Twain",
            "The exercise of an extraordinary gift is the supremest pleasure in life."
        ),
        Quote(
            "Etty Hillesum",
            "Sometimes the most important thing in a whole day is the rest we take between two deep breaths."
        ),
        Quote(
            "Mohandas Gandhi",
            "Forgiveness is choosing to love. It is the first skill of self-giving love."
        ),
        Quote(
            "William Londen",
            "To ensure good health: eat lightly, breathe deeply, live moderately, cultivate cheerfulness, and maintain an interest in life."
        ),
        Quote(
            "nan",
            "Most smiles are started by another smile."
        ),
        Quote(
            "Lao Tzu",
            "Nothing is softer or more flexible than water, yet nothing can resist it."
        ),
        Quote(
            "Dalai Lama",
            "It is difficult to achieve a spirit of genuine cooperation as long as people remain indifferent to the feelings and happiness of others."
        ),
        Quote(
            "Benjamin Franklin",
            "Experience keeps a dear school, but fools will learn in no other."
        ),
        Quote(
            "Thornton Wilder",
            "We can only be said to be alive in those moments when our hearts are conscious of our treasures."
        ),
        Quote(
            "Confucius",
            "Fine words and an insinuating appearance are seldom associated with true virtue"
        ),
        Quote(
            "Oliver Holmes",
            "We do not quit playing because we grow old, we grow old because we quit playing."
        ),
        Quote(
            "Wayne Dyer",
            "You can't choose up sides on a round world."
        ),
        Quote(
            "Mark Twain",
            "Kindness is the language which the deaf can hear and the blind can see."
        ),
        Quote(
            "Byron Pulsifer",
            "I may not know everything, but everything is not known yet anyway."
        ),
        Quote(
            "Buddha",
            "If we could see the miracle of a single flower clearly, our whole life would change."
        ),
        Quote(
            "Carl Jung",
            "Without this playing with fantasy no creative work has ever yet come to birth. The debt we owe to the play of the imagination is incalculable."
        ),
        Quote(
            "Buddha",
            "You cannot travel the path until you have become the path itself."
        ),
        Quote(
            "Theodore Roosevelt",
            "Keep your eyes on the stars and your feet on the ground."
        ),
        Quote(
            "William White",
            "I am not afraid of tomorrow, for I have seen yesterday and I love today."
        ),
        Quote(
            "Jamie Paolinetti",
            "Limitations live only in our minds. But if we use our imaginations, our possibilities become limitless."
        ),
        Quote(
            "nan",
            "When you lose, don't lose the lesson."
        ),
        Quote(
            "Napoleon Bonaparte",
            "If you want a thing done well, do it yourself."
        ),
        Quote(
            "Eriksson",
            "The greatest barrier to success is the fear of failure."
        ),
        Quote(
            "John Ruskin",
            "Sunshine is delicious, rain is refreshing, wind braces us up, snow is exhilarating; there is really no such thing as bad weather, only different kinds of good weather."
        ),
        Quote(
            "Joe Namath",
            "If you aren't going all the way, why go at all?"
        ),
        Quote(
            "Confucius",
            "Our greatest glory is not in never falling, but in rising every time we fall."
        ),
        Quote(
            "Pierre Abelard",
            "The beginning of wisdom is found in doubting; by doubting we come to the question, and by seeking we may come upon the truth."
        ),
        Quote(
            "nan",
            "If I could reach up and hold a star for every time you've made me smile, the entire evening sky would be in the palm of my hand."
        ),
        Quote(
            "Buddha",
            "We are shaped by our thoughts; we become what we think. When the mind is pure, joy follows like a shadow that never leaves."
        ),
        Quote(
            "Tony Robbins",
            "Stay committed to your decisions, but stay flexible in your approach."
        ),
        Quote(
            "Albert Schweitzer",
            "An optimist is a person who sees a green light everywhere, while the pessimist sees only the red spotlight... The truly wise person is colour-blind."
        ),
        Quote(
            "Donald Trump",
            "What separates the winners from the losers is how a person reacts to each new twist of fate."
        ),
        Quote(
            "Ralph Emerson",
            "Each man has his own vocation; his talent is his call. There is one direction in which all space is open to him."
        ),
        Quote(
            "Dhammapada",
            "Just as a flower, which seems beautiful has color but no perfume, so are the fruitless words of a man who speaks them but does them not."
        ),
        Quote(
            "William James",
            "To change ones life, start immediately, do it flamboyantly, no exceptions."
        ),
        Quote(
            "John F. Kennedy",
            "As we express our gratitude, we must never forget that the highest appreciation is not to utter words, but to live by them."
        ),
        Quote(
            "Booker Washington",
            "The world cares very little about what a man or woman knows; it is what a man or woman is able to do that counts."
        ),
        Quote(
            "nan",
            "The steeper the mountain the harder the climb the better the view from the finishing line"
        ),
        Quote(
            "Dr. David M. Burns",
            "Aim for success, not perfection. Never give up your right to be wrong, because then you will lose the ability to learn new things and move forward with your life."
        ),
        Quote(
            "Lao Tzu",
            "When I let go of what I am, I become what I might be."
        ),
        Quote(
            "Byron Pulsifer",
            "Transformation does not start with some one else changing you; transformation is an inner self reworking of what you are now to what you will be."
        ),
        Quote(
            "Byron Pulsifer",
            "Time is not a measure the length of a day or month or year but more a measure of what you have accomplished."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Wherever a man may happen to turn, whatever a man may undertake, he will always end up by returning to the path which nature has marked out for him."
        ),
        Quote(
            "Buddha",
            "Holding on to anger is like grasping a hot coal with the intent of throwing it at someone else; you are the one who gets burned."
        ),
        Quote(
            "African proverb",
            "When there is no enemy within, the enemies outside cannot hurt you."
        ),
        Quote(
            "Lao Tzu",
            "He who controls others may be powerful, but he who has mastered himself is mightier still."
        ),
        Quote(
            "Wayne Dyer",
            "There is no scarcity of opportunity to make a living at what you love; theres only scarcity of resolve to make it happen."
        ),
        Quote(
            "Wolfgang Amadeus Mozart",
            "Neither a lofty degree of intelligence nor imagination nor both together go to the making of genius. Love, love, love, that is the soul of genius."
        ),
        Quote(
            "H. Bertram Lewis",
            "The happy and efficient people in this world are those who accept trouble as a normal detail of human life and resolve to capitalize it when it comes along."
        ),
        Quote(
            "Saul Alinsky",
            "As an organizer I start from where the world is, as it is, not as I would like it to be."
        ),
        Quote(
            "Zig Ziglar",
            "You are the only person on Earth who can use your ability."
        ),
        Quote(
            "nan",
            "Don't let what you can't do stop you from doing what you can do."
        ),
        Quote(
            "Byron Pulsifer",
            "Complaining doesn't change a thing only taking action does."
        ),
        Quote(
            "Charles A. Lindbergh",
            "Life a culmination of the past, an awareness of the present, an indication of the future beyond knowledge, the quality that gives a touch of divinity to matter."
        ),
        Quote(
            "Robert Brault",
            "Enjoy the little things, for one day you may look back and realize they were the big things."
        ),
        Quote(
            "Oprah Winfrey",
            "With every experience, you alone are painting your own canvas, thought by thought, choice by choice."
        ),
        Quote(
            "Rumi",
            "Let the beauty of what you love be what you do."
        ),
        Quote(
            "Epictetus",
            "The world turns aside to let any man pass who knows where he is going."
        ),
        Quote(
            "Kahlil Gibran",
            "Beauty is not in the face; beauty is a light in the heart."
        ),
        Quote(
            "John Lubbock",
            "A day of worry is more exhausting than a day of work."
        ),
        Quote(
            "Ralph Emerson",
            "Truth, and goodness, and beauty are but different faces of the same all."
        ),
        Quote(
            "Ralph Emerson",
            "To be great is to be misunderstood."
        ),
        Quote(
            "Alfred Adler",
            "Trust only movement. Life happens at the level of events, not of words. Trust movement."
        ),
        Quote(
            "Winston Churchill",
            "Never, never, never give up."
        ),
        Quote(
            "Andre Gide",
            "The most decisive actions of our life... are most often unconsidered actions."
        ),
        Quote(
            "Robert Schuller",
            "As we grow as unique persons, we learn to respect the uniqueness of others."
        ),
        Quote(
            "Robert Schuller",
            "Failure doesn't mean you are a failure it just means you haven't succeeded yet."
        ),
        Quote(
            "Mahatma Gandhi",
            "It is the quality of our work which will please God, not the quantity."
        ),
        Quote(
            "Stephen Kaggwa",
            "Try and fail, but don't fail to try."
        ),
        Quote(
            "Epictetus",
            "First say to yourself what you would be; and then do what you have to do."
        ),
        Quote(
            "Carl Jung",
            "Through pride we are ever deceiving ourselves. But deep down below the surface of the average conscience a still, small voice says to us, Something is out of tune."
        ),
        Quote(
            "Epictetus",
            "Keep silence for the most part, and speak only when you must, and then briefly."
        ),
        Quote(
            "Percy Shelley",
            "Fear not for the future, weep not for the past."
        ),
        Quote(
            "Wayne Dyer",
            "We are Divine enough to ask and we are important enough to receive."
        ),
        Quote(
            "Korean proverb",
            "If you kick a stone in anger, you'll hurt your own foot."
        ),
        Quote(
            "Lao Tzu",
            "To see things in the seed, that is genius."
        ),
        Quote(
            "Bertrand Russell",
            "The happiness that is genuinely satisfying is accompanied by the fullest exercise of our faculties and the fullest realization of the world in which we live."
        ),
        Quote(
            "Douglas Adams",
            "Human beings, who are almost unique in having the ability to learn from the experience of others, are also remarkable for their apparent disinclination to do so."
        ),
        Quote(
            "Ralph Emerson",
            "Make the most of yourself, for that is all there is of you."
        ),
        Quote(
            "Muriel Rukeyser",
            "The universe is made of stories, not atoms."
        ),
        Quote(
            "Frank Wright",
            "Respect should be earned by actions, and not acquired by years."
        ),
        Quote(
            "Confucius",
            "I hear and I forget. I see and I remember. I do and I understand."
        ),
        Quote(
            "Will Durant",
            "The trouble with most people is that they think with their hopes or fears or wishes rather than with their minds."
        ),
        Quote(
            "Chuck Norris",
            "A lot of people give up just before theyre about to make it. You know you never know when that next obstacle is going to be the last one."
        ),
        Quote(
            "Lauren Raffo",
            "Sometimes the biggest act of courage is a small one."
        ),
        Quote(
            "Tony Robbins",
            "People are not lazy. They simply have impotent goals, that is, goals that do not inspire them."
        ),
        Quote(
            "Eckhart Tolle",
            "You do not become good by trying to be good, but by finding the goodness that is already within you."
        ),
        Quote(
            "Marcus Aurelius",
            "Waste no more time arguing about what a good man should be. Be one."
        ),
        Quote(
            "John Barrymore",
            "Happiness often sneaks in through a door you didn't know you left open."
        ),
        Quote(
            "Mark Twain",
            "There are basically two types of people. People who accomplish things, and people who claim to have accomplished things. The first group is less crowded."
        ),
        Quote(
            "Winifred Holtby",
            "The things that one most wants to do are the things that are probably most worth doing."
        ),
        Quote(
            "Abraham Lincoln",
            "Always bear in mind that your own resolution to succeed is more important than any one thing."
        ),
        Quote(
            "Albert Einstein",
            "Setting an example is not the main means of influencing another, it is the only means."
        ),
        Quote(
            "Richard Garriott",
            "Chaos and Order are not enemies, only opposites."
        ),
        Quote(
            "Henry Longfellow",
            "Perseverance is a great element of success. If you only knock long enough and loud enough at the gate, you are sure to wake up somebody."
        ),
        Quote(
            "Harriet Lerner",
            "Only through our connectedness to others can we really know and enhance the self. And only through working on the self can we begin to enhance our connectedness to others."
        ),
        Quote(
            "Chinese proverb",
            "He who deliberates fully before taking a step will spend his entire life on one leg."
        ),
        Quote(
            "Mother Teresa",
            "Peace begins with a smile."
        ),
        Quote(
            "Doug Horton",
            "Be your own hero, it's cheaper than a movie ticket."
        ),
        Quote(
            "Maori proverb",
            "Turn your face toward the sun and the shadows will fall behind you."
        ),
        Quote(
            "Jack Buck",
            "Things turn out best for those who make the best of the way things turn out."
        ),
        Quote(
            "Whoopi Goldberg",
            "Were here for a reason. I believe a bit of the reason is to throw little torches out to lead people through the dark."
        ),
        Quote(
            "Anthony Robbins",
            "To effectively communicate, we must realize that we are all different in the way we perceive the world and use this understanding as a guide to our communication with others."
        ),
        Quote(
            "Confucius",
            "Ability will never catch up with the demand for it."
        ),
        Quote(
            "Albert Schweitzer",
            "Never say there is nothing beautiful in the world any more. There is always something to make you wonder in the shape of a tree, the trembling of a leaf."
        ),
        Quote(
            "Henry Reed",
            "Intuition is the very force or activity of the soul in its experience through whatever has been the experience of the soul itself."
        ),
        Quote(
            "Tony Robbins",
            "Setting goals is the first step in turning the invisible into the visible."
        ),
        Quote(
            "Pat Riley",
            "Courage is not the absence of fear, but simply moving on with dignity despite that fear."
        ),
        Quote(
            "Galileo Galilei",
            "All truths are easy to understand once they are discovered; the point is to discover them."
        ),
        Quote(
            "Oscar Wilde",
            "The smallest act of kindness is worth more than the grandest intention."
        ),
        Quote(
            "Margaret Wheatley",
            "We know from science that nothing in the universe exists as an isolated or independent entity."
        ),
        Quote(
            "Ralph Emerson",
            "Everything in the universe goes by indirection. There are no straight lines."
        ),
        Quote(
            "George Eliot",
            "What do we live for, if it is not to make life less difficult for each other?"
        ),
        Quote(
            "Tenzin Gyatso",
            "When we feel love and kindness toward others, it not only makes others feel loved and cared for, but it helps us also to develop inner happiness and peace."
        ),
        Quote(
            "Maya Angelou",
            "We may encounter many defeats but we must not be defeated."
        ),
        Quote(
            "Richard Bach",
            "Every person, all the events of your life are there because you have drawn them there. What you choose to do with them is up to you."
        ),
        Quote(
            "Albert Einstein",
            "Logic will get you from A to B. Imagination will take you everywhere."
        ),
        Quote(
            "Sarah Breathnach",
            "Our deepest wishes are whispers of our authentic selves. We must learn to respect them. We must learn to listen."
        ),
        Quote(
            "Henry Thoreau",
            "The world is but a canvas to the imagination."
        ),
        Quote(
            "Lisa Alther",
            "Thats the risk you take if you change: that people you've been involved with won't like the new you. But other people who do will come along."
        ),
        Quote(
            "Walter Benjamin",
            "To be happy is to be able to become aware of oneself without fright."
        ),
        Quote(
            "Byron Pulsifer",
            "Strength to carry on despite the odds means you have faith in your own abilities and know how."
        ),
        Quote(
            "Ralph Emerson",
            "Make the most of yourself for that is all there is of you."
        ),
        Quote(
            "Lama Yeshe",
            "Be gentle first with yourself if you wish to be gentle with others."
        ),
        Quote(
            "Cardinal Retz",
            "A man who doesn't trust himself can never really trust anyone else."
        ),
        Quote(
            "Benjamin Disraeli",
            "We make our own fortunes and we call them fate."
        ),
        Quote(
            "Vince Lombardi",
            "Leaders aren't born they are made. And they are made just like anything else, through hard work. And that's the price well have to pay to achieve that goal, or any goal."
        ),
        Quote(
            "E. E. Cummings",
            "It takes courage to grow up and become who you really are."
        ),
        Quote(
            "Og Mandino",
            "Always seek out the seed of triumph in every adversity."
        ),
        Quote(
            "Catherine Pulsifer",
            "Rather than wishing for change, you first must be prepared to change."
        ),
        Quote(
            "Buddha",
            "I do not believe in a fate that falls on men however they act; but I do believe in a fate that falls on them unless they act."
        ),
        Quote(
            "Holmes",
            "Fame usually comes to those who are thinking about something else."
        ),
        Quote(
            "Napoleon Hill",
            "First comes thought; then organization of that thought, into ideas and plans; then transformation of those plans into reality. The beginning, as you will observe, is in your imagination."
        ),
        Quote(
            "Confucius",
            "The superior man acts before he speaks, and afterwards speaks according to his action."
        ),
        Quote(
            "Chinese proverb",
            "A single conversation across the table with a wise person is worth a months study of books."
        ),
        Quote(
            "Mohandas Gandhi",
            "The difference between what we do and what we are capable of doing would suffice to solve most of the worlds problems."
        ),
        Quote(
            "nan",
            "You can never cross the ocean unless you have the courage to lose sight of the shore."
        ),
        Quote(
            "Vaclav Havel",
            "Work for something because it is good, not just because it stands a chance to succeed."
        ),
        Quote(
            "Carl Jung",
            "Knowledge rests not upon truth alone, but upon error also."
        ),
        Quote(
            "Katherine Mansfield",
            "Make it a rule of life never to regret and never to look back. Regret is an appalling waste of energy; you can't build on it; it's only for wallowing in."
        ),
        Quote(
            "Victoria Holt",
            "Never regret. If it's good, it's wonderful. If it's bad, it's experience."
        ),
        Quote(
            "Chuang Tzu",
            "When deeds and words are in accord, the whole world is transformed."
        ),
        Quote(
            "Mother Teresa",
            "Kind words can be short and easy to speak but their echoes are truly endless."
        ),
        Quote(
            "William Blake",
            "For everything that lives is holy, life delights in life."
        ),
        Quote(
            "Dalai Lama",
            "The most important thing is transforming our minds, for a new way of thinking, a new outlook: we should strive to develop a new inner world."
        ),
        Quote(
            "Billie Armstrong",
            "Our passion is our strength."
        ),
        Quote(
            "Leonardo da Vinci",
            "In rivers, the water that you touch is the last of what has passed and the first of that which comes; so with present time."
        ),
        Quote(
            "Byron Pulsifer",
            "Spring is a time for rebirth and the fulfilment of new life."
        ),
        Quote(
            "Marcus Aurelius",
            "There is nothing happens to any person but what was in his power to go through with."
        ),
        Quote(
            "Alfred Korzybski",
            "There are two ways to slide easily through life: to believe everything or to doubt everything; both ways save us from thinking."
        ),
        Quote(
            "Alfred Whitehead",
            "The art of progress is to preserve order amid change, and to preserve change amid order."
        ),
        Quote(
            "Winston Churchill",
            "We make a living by what we get, but we make a life by what we give."
        ),
        Quote(
            "Friedrich von Schiller",
            "If you want to study yourself, look into the hearts of other people. If you want to study other people, look into your own heart."
        ),
        Quote(
            "Wayne Dyer",
            "Maxim for life: You get treated in life the way you teach people to treat you."
        ),
        Quote(
            "Charlotte Perkins Gilman",
            "The first duty of a human being is to assume the right functional relationship to society, more briefly, to find your real job, and do it."
        ),
        Quote(
            "Lao Tzu",
            "The key to growth is the introduction of higher dimensions of consciousness into our awareness."
        ),
        Quote(
            "Ralph Emerson",
            "Thought is the blossom; language the bud; action the fruit behind it."
        ),
        Quote(
            "Daisaku Ikeda",
            "True happiness means forging a strong spirit that is undefeated, no matter how trying our circumstances."
        ),
        Quote(
            "Peter Drucker",
            "There is nothing so useless as doing efficiently that which should not be done at all."
        ),
        Quote(
            "Leonardo da Vinci",
            "I have been impressed with the urgency of doing. Knowing is not enough; we must apply. Being willing is not enough; we must do."
        ),
        Quote(
            "William Shakespeare",
            "All the world is a stage, And all the men and women merely players.They have their exits and entrances; Each man in his time plays many parts."
        ),
        Quote(
            "Nelson Mandela",
            "As we are liberated from our own fear, our presence automatically liberates others."
        ),
        Quote(
            "James Yorke",
            "The most successful people are those who are good at plan B."
        ),
        Quote(
            "Aristotle",
            "Criticism is something you can easily avoid by saying nothing, doing nothing, and being nothing."
        ),
        Quote(
            "Richard Bach",
            "To fly as fast as thought, you must begin by knowing that you have already arrived."
        ),
        Quote(
            "Hannah More",
            "Obstacles are those things you see when you take your eyes off the goal."
        ),
        Quote(
            "Michelangelo",
            "The greatest danger for most of us is not that our aim is too high and we miss it, but that it is too low and we reach it."
        ),
        Quote(
            "Albert Einstein",
            "Great ideas often receive violent opposition from mediocre minds."
        ),
        Quote(
            "Tony Robbins",
            "We can change our lives. We can do, have, and be exactly what we wish."
        ),
        Quote(
            "Zig Ziglar",
            "You are the only person on earth who can use your ability."
        ),
        Quote(
            "Jean Lacordaire",
            "Neither genius, fame, nor love show the greatness of the soul. Only kindness can do that."
        ),
        Quote(
            "Carl Jung",
            "The least of things with a meaning is worth more in life than the greatest of things without it."
        ),
        Quote(
            "Isocrates",
            "The noblest worship is to make yourself as good and as just as you can."
        ),
        Quote(
            "Carl Bard",
            "Though no one can go back and make a brand new start, anyone can start from not and make a brand new ending."
        ),
        Quote(
            "Denis Waitley",
            "A dream is your creative vision for your life in the future. You must break out of your current comfort zone and become comfortable with the unfamiliar and the unknown."
        ),
        Quote(
            "Robert Orben",
            "Don't think of it as failure. Think of it as time-released success."
        ),
        Quote(
            "Aristotle",
            "We are what we repeatedly do. Excellence, then, is not an act but a habit."
        ),
        Quote(
            "Abraham Lincoln",
            "I walk slowly, but I never walk backward."
        ),
        Quote(
            "Rene Descartes",
            "Divide each difficulty into as many parts as is feasible and necessary to resolve it."
        ),
        Quote(
            "nan",
            "The best place to find a helping hand is at the end of your own arm."
        ),
        Quote(
            "Blaise Pascal",
            "We know the truth, not only by the reason, but by the heart."
        ),
        Quote(
            "Kahlil Gibran",
            "We choose our joys and sorrows long before we experience them."
        ),
        Quote(
            "Oscar Wilde",
            "Anybody can make history. Only a great man can write it."
        ),
        Quote(
            "Hermann Hesse",
            "If I know what love is, it is because of you."
        ),
        Quote(
            "Richard Bach",
            "Allow the world to live as it chooses, and allow yourself to live as you choose."
        ),
        Quote(
            "Barack Obama",
            "Focusing your life solely on making a buck shows a poverty of ambition. It asks too little of yourself. And it will leave you unfulfilled."
        ),
        Quote(
            "Dalai Lama",
            "Compassion and happiness are not a sign of weakness but a sign of strength."
        ),
        Quote(
            "Franklin D. Roosevelt",
            "It is common sense to take a method and try it. If it fails, admit it frankly and try another. But above all, try something."
        ),
        Quote(
            "David Bader",
            "Be here now. Be someplace else later. Is that so complicated?"
        ),
        Quote(
            "Mahummad Ali",
            "To be able to give away riches is mandatory if you wish to possess them. This is the only way that you will be truly rich."
        ),
        Quote(
            "Confucius",
            "Learning without reflection is a waste, reflection without learning is dangerous."
        ),
        Quote(
            "nan",
            "Don't fear failure so much that you refuse to try new things. The saddest summary of life contains three descriptions: could have, might have, and should have."
        ),
        Quote(
            "Bruce Lee",
            "All fixed set patterns are incapable of adaptability or pliability. The truth is outside of all fixed patterns."
        ),
        Quote(
            "Oprah Winfrey",
            "I don't believe in failure. It's not failure if you enjoyed the process."
        ),
        Quote(
            "Helen Keller",
            "The best and most beautiful things in the world cannot be seen, nor touched... but are felt in the heart."
        ),
        Quote(
            "David Rockefeller",
            "Success in business requires training and discipline and hard work. But if you're not frightened by these things, the opportunities are just as great today as they ever were."
        ),
        Quote(
            "Cavour",
            "The man who trusts men will make fewer mistakes than he who distrusts them."
        ),
        Quote(
            "Bruce Lee",
            "The less effort, the faster and more powerful you will be."
        ),
        Quote(
            "Ralph Emerson",
            "We must be as courteous to a man as we are to a picture, which we are willing to give the advantage of a good light."
        ),
        Quote(
            "Anais Nin",
            "The dream was always running ahead of me. To catch up, to live for a moment in unison with it, that was the miracle."
        ),
        Quote(
            "Ellen Parr",
            "The cure for boredom is curiosity. There is no cure for curiosity."
        ),
        Quote(
            "Mother Teresa",
            "We can do no great things, only small things with great love."
        ),
        Quote(
            "Kahlil Gibran",
            "Be like the flower, turn your face to the sun."
        ),
        Quote(
            "Buddha",
            "Remembering a wrong is like carrying a burden on the mind."
        ),
        Quote(
            "James Openheim",
            "The foolish man seeks happiness in the distance; the wise grows it under his feet."
        ),
        Quote(
            "Henry Beecher",
            "Gratitude is the fairest blossom which springs from the soul."
        ),
        Quote(
            "Confucius",
            "If you look into your own heart, and you find nothing wrong there, what is there to worry about? What is there to fear?"
        ),
        Quote(
            "John Acosta",
            "You cannot have what you do not want."
        ),
        Quote(
            "Ralph Waldo Emerson",
            "Do not follow where the path may lead. Go, instead, where there is no path and leave a trail."
        ),
        Quote(
            "Eleanor Roosevelt",
            "It is not fair to ask of others what you are unwilling to do yourself."
        ),
        Quote(
            "Carl Jung",
            "Knowing your own darkness is the best method for dealing with the darknesses of other people."
        ),
        Quote(
            "Moncure Conway",
            "The best thing in every noble dream is the dreamer..."
        ),
        Quote(
            "Walt Disney",
            "Weve got to have a dream if we are going to make a dream come true."
        ),
        Quote(
            "Norman Peale",
            "If you want things to be different, perhaps the answer is to become different yourself."
        ),
        Quote(
            "Alexander the Great",
            "There is nothing impossible to him who will try."
        ),
        Quote(
            "Theodore Rubin",
            "Kindness is more important than wisdom, and the recognition of this is the beginning of wisdom."
        ),
        Quote(
            "Harriet Tubman",
            "Every great dream begins with a dreamer. Always remember, you have within you the strength, the patience, and the passion to reach for the stars to change the world."
        ),
        Quote(
            "Buddha",
            "The only real failure in life is not to be true to the best one knows."
        ),
        Quote(
            "Albert Einstein",
            "Anyone who doesn't take truth seriously in small matters cannot be trusted in large ones either."
        ),
        Quote(
            "Barack Obama",
            "Change will not come if we wait for some other person or some other time. We are the ones weve been waiting for. We are the change that we seek."
        ),
        Quote(
            "George Santayan",
            "Those who cannot learn from history are doomed to repeat it."
        ),
        Quote(
            "Carlos Castaneda",
            "The trick is in what one emphasizes. We either make ourselves miserable, or we make ourselves happy. The amount of work is the same."
        ),
        Quote(
            "Seneca",
            "Things that were hard to bear are sweet to remember."
        ),
        Quote(
            "Henry James",
            "Three things in human life are important. The first is to be kind. The second is to be kind. The third is to be kind."
        ),
        Quote(
            "Buddha",
            "However many holy words you read, However many you speak, What good will they do you If you do not act on upon them?"
        ),
        Quote(
            "Virgil",
            "They can conquer who believe they can."
        ),
        Quote(
            "Frank Tyger",
            "Learn to listen. Opportunity could be knocking at your door very softly."
        ),
        Quote(
            "Sai Baba",
            "All action results from thought, so it is thoughts that matter."
        ),
        Quote(
            "Albert Einstein",
            "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle."
        ),
        Quote(
            "Colette",
            "I love my past. I love my present. Im not ashamed of what Ive had, and Im not sad because I have it no longer."
        ),
        Quote(
            "Maya Angelou",
            "Prejudice is a burden that confuses the past, threatens the future and renders the present inaccessible."
        ),
        Quote(
            "William Hazlitt",
            "Just as much as we see in others we have in ourselves."
        ),
        Quote(
            "Geoffrey F. Abert",
            "Prosperity depends more on wanting what you have than having what you want."
        ),
        Quote(
            "Coco Chanel",
            "How many cares one loses when one decides not to be something but to be someone."
        ),
        Quote(
            "Lao Tzu",
            "He who knows, does not speak. He who speaks, does not know."
        ),
        Quote(
            "nan",
            "We cannot direct the wind but we can adjust the sails."
        ),
        Quote(
            "Albert Einstein",
            "One may say the eternal mystery of the world is its comprehensibility."
        ),
        Quote(
            "John Dewey",
            "The self is not something ready-made, but something in continuous formation through choice of action."
        ),
        Quote(
            "Mahatma Gandhi",
            "Our greatness lies not so much in being able to remake the world as being able to remake ourselves."
        ),
        Quote(
            "Philip Breedveld",
            "Moments of complete apathy are the best for new creations."
        ),
        Quote(
            "John Powell",
            "The only real mistake is the one from which we learn nothing."
        ),
        Quote(
            "Tim Menchen",
            "To dream of the person you would like to be is to waste the person you are."
        ),
        Quote(
            "Charles Dubois",
            "The important thing is this: to be able at any moment to sacrifice what we are for what we could become."
        ),
        Quote(
            "Cicero",
            "Gratitude is not only the greatest of virtues, but the paren't of all the others."
        ),
        Quote(
            "Lama Yeshe",
            "It is never too late. Even if you are going to die tomorrow, keep yourself straight and clear and be a happy human being today."
        ),
        Quote(
            "Byron Pulsifer",
            "Respect is not something that you can ask for, buy or borrow. Respect is what you earn from each person no matter their background or status."
        ),
        Quote(
            "Henry Thoreau",
            "Things do not change; we change."
        ),
        Quote(
            "Blaise Pascal",
            "We must learn our limits. We are all something, but none of us are everything."
        ),
        Quote(
            "Stephen Sigmund",
            "Learn wisdom from the ways of a seedling. A seedling which is never hardened off through stressful situations will never become a strong productive plant."
        ),
        Quote(
            "Charles R. Swindoll",
            "We are all faced with a series of great opportunities brilliantly disguised as impossible situations."
        ),
        Quote(
            "Albert Camus",
            "All men have a sweetness in their life. That is what helps them go on. It is towards that they turn when they feel too worn out."
        ),
        Quote(
            "Frank Tyger",
            "Be a good listener. Your ears will never get you in trouble."
        ),
        Quote(
            "Buddha",
            "Meditation brings wisdom; lack of mediation leaves ignorance. Know well what leads you forward and what hold you back, and choose the path that leads to wisdom."
        ),
        Quote(
            "Anatole France",
            "You learn to speak by speaking, to study by studying, to run by running, to work by working; in just the same way, you learn to love by loving."
        ),
        Quote(
            "John Marshall",
            "To listen well is as powerful a means of communication and influence as to talk well."
        ),
        Quote(
            "George Sand",
            "There is only one happiness in life, to love and be loved."
        ),
        Quote(
            "Matt Zotti",
            "Live through feeling and you will live through love. For feeling is the language of the soul, and feeling is truth."
        ),
        Quote(
            "Lao Tzu",
            "Kindness in words creates confidence. Kindness in thinking creates profoundness. Kindness in giving creates love."
        ),
        Quote(
            "Thomas Jefferson",
            "Reason and free inquiry are the only effectual agents against error."
        ),
        Quote(
            "Napoleon Bonaparte",
            "The best cure for the body is a quiet mind."
        ),
        Quote(
            "Dalai Lama",
            "See the positive side, the potential, and make an effort."
        ),
        Quote(
            "Jane Roberts",
            "By accepting yourself and being fully what you are, your presence can make others happy."
        ),
        Quote(
            "Norman Cousins",
            "Never deny a diagnosis, but do deny the negative verdict that may go with it."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "The really unhappy person is the one who leaves undone what they can do, and starts doing what they don't understand; no wonder they come to grief."
        ),
        Quote(
            "Wayne Dyer",
            "You cannot be lonely if you like the person you're alone with."
        ),
        Quote(
            "G. K. Chesterton",
            "I do not believe in a fate that falls on men however they act; but I do believe in a fate that falls on man unless they act."
        ),
        Quote(
            "Buddha",
            "If you propose to speak, always ask yourself, is it true, is it necessary, is it kind."
        ),
        Quote(
            "Cadet Maxim",
            "Risk more than others think is safe. Care more than others think is wise. Dream more than others think is practical.Expect more than others think is possible."
        ),
        Quote(
            "Og Mandino",
            "Failure will never overtake me if my determination to succeed is strong enough."
        ),
        Quote(
            "Ralph Marston",
            "Let go of your attachment to being right, and suddenly your mind is more open. You're able to benefit from the unique viewpoints of others, without being crippled by your own judgement."
        ),
        Quote(
            "Mark Twain",
            "Wrinkles should merely indicate where smiles have been."
        ),
        Quote(
            "Zig Ziglar",
            "Your attitude, not your aptitude, will determine your altitude."
        ),
        Quote(
            "Rumi",
            "Let yourself be silently drawn by the stronger pull of what you really love."
        ),
        Quote(
            "Richard Bach",
            "I gave my life to become the person I am right now. Was it worth it?"
        ),
        Quote(
            "Hausa",
            "Give thanks for a little and you will find a lot."
        ),
        Quote(
            "Arie de Gues",
            "Your ability to learn faster than your competition is your only sustainable competitive advantage."
        ),
        Quote(
            "Paul Boese",
            "Forgiveness does not change the past, but it does enlarge the future."
        ),
        Quote(
            "Nikola Tesla",
            "Let the future tell the truth, and evaluate each one according to his work and accomplishments. The present is theirs; the future, for which I have really worked, is mine."
        ),
        Quote(
            "Aristotle",
            "Moral excellence comes about as a result of habit. We become just by doing just acts, temperate by doing temperate acts, brave by doing brave acts."
        ),
        Quote(
            "William James",
            "The deepest craving of human nature is the need to be appreciated."
        ),
        Quote(
            "Antoine de Saint-Exupery",
            "Love does not consist of gazing at each other, but in looking together in the same direction."
        ),
        Quote(
            "Edwin Markham",
            "We have committed the Golden Rule to memory; let us now commit it to life."
        ),
        Quote(
            "Robert Southey",
            "It is with words as with sunbeams. The more they are condensed, the deeper they burn."
        ),
        Quote(
            "Tony Robbins",
            "When people are like each other they tend to like each other."
        ),
        Quote(
            "Confucius",
            "Sincerity is the way of Heaven. The attainment of sincerity is the way of men."
        ),
        Quote(
            "Mohandas Gandhi",
            "Be the change that you want to see in the world."
        ),
        Quote(
            "Jim Rohn",
            "The more you care, the stronger you can be."
        ),
        Quote(
            "Oprah Winfrey",
            "Lots of people want to ride with you in the limo, but what you want is someone who will take the bus with you when the limo breaks down."
        ),
        Quote(
            "Goethe",
            "Just trust yourself, then you will know how to live."
        ),
        Quote(
            "Pema Chodron",
            "To be fully alive, fully human, and completely awake is to be continually thrown out of the nest."
        ),
        Quote(
            "Jim Rohn",
            "If you don't design your own life plan, chances are you'll fall into someone else's plan. And guess what they have planned for you? Not much."
        ),
        Quote(
            "Carl Jung",
            "It all depends on how we look at things, and not how they are in themselves."
        ),
        Quote(
            "nan",
            "Giving up doesn't always mean you are weak; sometimes it means that you are strong enough to let go."
        ),
        Quote(
            "William Shakespeare",
            "To climb steep hills requires a slow pace at first."
        ),
        Quote(
            "Buddha",
            "An idea that is developed and put into action is more important than an idea that exists only as an idea."
        ),
        Quote(
            "Max Planck",
            "It is not the possession of truth, but the success which attends the seeking after it, that enriches the seeker and brings happiness to him."
        ),
        Quote(
            "Abraham Lincoln",
            "Truth is generally the best vindication against slander."
        ),
        Quote(
            "Anna Pavlova",
            "To follow, without halt, one aim: There is the secret of success."
        ),
        Quote(
            "Nelson Mandela",
            "And as we let our own light shine, we unconsciously give other people permission to do the same."
        ),
        Quote(
            "Ralph Emerson",
            "What is a weed? A plant whose virtues have not yet been discovered."
        ),
        Quote(
            "Ralph Emerson",
            "Belief consists in accepting the affirmations of the soul; Unbelief, in denying them."
        ),
        Quote(
            "nan",
            "Many people have gone further than they thought they could because someone else thought they could."
        ),
        Quote(
            "Rabindranath Tagore",
            "We read the world wrong and say that it deceives us."
        ),
        Quote(
            "Edith Wharton",
            "If only wed stop trying to be happy wed have a pretty good time."
        ),
        Quote(
            "Eleanor Roosevelt",
            "You must do the things you think you cannot do."
        ),
        Quote(
            "Oscar Wilde",
            "Be yourself; everyone else is already taken."
        ),
        Quote(
            "Richard Bach",
            "The mark of your ignorance is the depth of your belief in injustice and tragedy. What the caterpillar calls the end of the world, the Master calls the butterfly."
        ),
        Quote(
            "Edna Millay",
            "I am glad that I paid so little attention to good advice; had I abided by it I might have been saved from some of my most valuable mistakes."
        ),
        Quote(
            "Abraham Lincoln",
            "Most folks are as happy as they make up their minds to be."
        ),
        Quote(
            "Oliver Holmes",
            "Love is the master key that opens the gates of happiness."
        ),
        Quote(
            "Cecil B. DeMille",
            "The person who makes a success of living is the one who see his goal steadily and aims for it unswervingly. That is dedication."
        ),
        Quote(
            "George Shaw",
            "My reputation grows with every failure."
        ),
        Quote(
            "Ralph Emerson",
            "Good thoughts are no better than good dreams, unless they be executed."
        ),
        Quote(
            "Dalai Lama",
            "Happiness does not come about only due to external circumstances; it mainly derives from inner attitudes."
        ),
        Quote(
            "Buddha",
            "However many holy words you read, however many you speak, what good will they do you if you do not act on upon them?"
        ),
        Quote(
            "Harry Banks",
            "For success, attitude is equally as important as ability."
        ),
        Quote(
            "Colin Powell",
            "If you are going to achieve excellence in big things, you develop the habit in little matters. Excellence is not an exception, it is a prevailing attitude."
        ),
        Quote(
            "Albert Einstein",
            "A person who never made a mistake never tried anything new."
        ),
        Quote(
            "Buddha",
            "Better than a thousand hollow words is one word that brings peace."
        ),
        Quote(
            "George Bernard Shaw",
            "The possibilities are numerous once we decide to act and not react."
        ),
        Quote(
            "Henri Amiel",
            "Almost everything comes from nothing."
        ),
        Quote(
            "Donald Trump",
            "Sometimes by losing a battle you find a new way to win the war."
        ),
        Quote(
            "Richard Bach",
            "Listen to what you know instead of what you fear."
        ),
        Quote(
            "Betty Friedan",
            "It is easier to live through someone else than to become complete yourself."
        ),
        Quote(
            "John Simone",
            "If you're in a bad situation, don't worry it'll change. If you're in a good situation, don't worry it'll change."
        ),
        Quote(
            "Zig Ziglar",
            "Remember that failure is an event, not a person."
        ),
        Quote(
            "Oprah Winfrey",
            "Don't settle for a relationship that won't let you be yourself."
        ),
        Quote(
            "Richard Bach",
            "What the caterpillar calls the end of the world, the master calls a butterfly."
        ),
        Quote(
            "Thomas Carlyle",
            "Instead of saying that man is the creature of circumstance, it would be nearer the mark to say that man is the architect of circumstance."
        ),
        Quote(
            "Tony Robbins",
            "If you do what you've always done, you'll get what youve always gotten."
        ),
        Quote(
            "Mother Teresa",
            "Do not wait for leaders; do it alone, person to person."
        ),
        Quote(
            "Plotinus",
            "Knowledge has three degrees, opinion, science, illumination. The means or instrument of the first is sense; of the second, dialectic; of the third, intuition."
        ),
        Quote(
            "Mary Parrish",
            "Love vanquishes time. To lovers, a moment can be eternity, eternity can be the tick of a clock."
        ),
        Quote(
            "Voltaire",
            "We never live; we are always in the expectation of living."
        ),
        Quote(
            "Henri L. Bergson",
            "Think like a man of action; act like a man of thought."
        ),
        Quote(
            "Ziggy",
            "You can complain because roses have thorns, or you can rejoice because thorns have roses."
        ),
        Quote(
            "Anais Nin",
            "There is not one big cosmic meaning for all, there is only the meaning we each give to our life."
        ),
        Quote(
            "Lao Tzu",
            "A leader is best when people barely know he exists, when his work is done, his aim fulfilled, they will say: we did it ourselves."
        ),
        Quote(
            "John Lennon",
            "Time you enjoyed wasting was not wasted."
        ),
        Quote(
            "Albert Camus",
            "You will never be happy if you continue to search for what happiness consists of. You will never live if you are looking for the meaning of life."
        ),
        Quote(
            "Daisaku Ikeda",
            "Genuine sincerity opens people's hearts, while manipulation causes them to close."
        ),
        Quote(
            "Confucius",
            "To give ones self earnestly to the duties due to men, and, while respecting spiritual beings, to keep aloof from them, may be called wisdom."
        ),
        Quote(
            "Zadok Rabinowitz",
            "A man's dreams are an index to his greatness."
        ),
        Quote(
            "William Lyon Phelps",
            "This is the final test of a gentleman: his respect for those who can be of no possible value to him."
        ),
        Quote(
            "Richard Bach",
            "You teach best what you most need to learn."
        ),
        Quote(
            "Winston Churchill",
            "Continuous effort, not strength or intelligence, is the key to unlocking our potential."
        ),
        Quote(
            "Henry Ford",
            "Obstacles are those frightful things you see when you take your eyes off your goal."
        ),
        Quote(
            "Wayne Dyer",
            "Go for it now. The future is promised to no one."
        ),
        Quote(
            "John Holmes",
            "Never tell a young person that anything cannot be done. God may have been waiting centuries for someone ignorant enough of the impossible to do that very thing."
        ),
        Quote(
            "Byron Pulsifer",
            "Bold is not the act of foolishness but the attribute and inner strength to act when others will not so as to move forward not backward."
        ),
        Quote(
            "Daisaku Ikeda",
            "If we look at the world with a love of life, the world will reveal its beauty to us."
        ),
        Quote(
            "Ralph Emerson",
            "In skating over thin ice our safety is in our speed."
        ),
        Quote(
            "W. Clement Stone",
            "When you discover your mission, you will feel its demand. It will fill you with enthusiasm and a burning desire to get to work on it."
        ),
        Quote(
            "Publilius Syrus",
            "Never promise more than you can perform."
        ),
        Quote(
            "Nora Roberts",
            "If you don't go after what you want, you'll never have it. If you don't ask, the answer is always no. If you don't step forward, you're always in the same place."
        ),
        Quote(
            "Lou Holtz",
            "I can't believe that God put us on this earth to be ordinary."
        ),
        Quote(
            "Napoleon Hill",
            "There are no limitations to the mind except those we acknowledge."
        ),
        Quote(
            "Jules Poincare",
            "It is through science that we prove, but through intuition that we discover."
        ),
        Quote(
            "Richard Bach",
            "Don't be dismayed by good-byes. A farewell is necessary before you can meet again. And meeting again, after moments or lifetimes, is certain for those who are friends."
        ),
        Quote(
            "Carla Gordon",
            "If someone in your life talked to you the way you talk to yourself, you would have left them long ago."
        ),
        Quote(
            "Edward Ericson",
            "The cosmos is neither moral or immoral; only people are. He who would move the world must first move himself."
        ),
        Quote(
            "Daisaku Ikeda",
            "If you lose today, win tomorrow. In this never-ending spirit of challenge is the heart of a victor."
        ),
        Quote(
            "Linda Hogan",
            "There is a way that nature speaks, that land speaks. Most of the time we are simply not patient enough, quiet enough, to pay attention to the story."
        ),
        Quote(
            "Georg Lichtenberg",
            "I cannot say whether things will get better if we change; what I can say is they must change if they are to get better."
        ),
        Quote(
            "Eckhart Tolle",
            "The greater part of human pain is unnecessary. It is self-created as long as the unobserved mind runs your life."
        ),
        Quote(
            "Alexander Pope",
            "Blessed is the man who expects nothing, for he shall never be disappointed."
        ),
        Quote(
            "Lao Tzu",
            "He who knows others is wise. He who knows himself is enlightened."
        ),
        Quote(
            "Peter Drucker",
            "The best way to predict your future is to create it."
        ),
        Quote(
            "May Sarton",
            "A garden is always a series of losses set against a few triumphs, like life itself."
        ),
        Quote(
            "Rachel Carson",
            "If facts are the seeds that later produce knowledge and wisdom, then the emotions and the impressions of the senses are the fertile soil in which the seeds must grow."
        ),
        Quote(
            "Ernest Hemingway",
            "Never mistake motion for action."
        ),
        Quote(
            "Hannah Senesh",
            "One needs something to believe in, something for which one can have whole-hearted enthusiasm. One needs to feel that ones life has meaning, that one is needed in this world."
        ),
        Quote(
            "Lao Tzu",
            "One who is too insistent on his own views, finds few to agree with him."
        ),
        Quote(
            "Harry Burchell Mathews",
            "Translation is the paradigm, the exemplar of all writing. It is translation that demonstrates most vividly the yearning for transformation that underlies every act involving speech, that supremely human gift."
        ),
        Quote(
            "Voltaire",
            "Meditation is the dissolution of thoughts in eternal awareness or Pure consciousness without objectification, knowing without thinking, merging finitude in infinity."
        ),
        Quote(
            "George Shaw",
            "The reasonable man adapts himself to the world; the unreasonable man persists in trying to adapt the world to himself. Therefore, all progress depends on the unreasonable man."
        ),
        Quote(
            "Michael Burke",
            "Good instincts usually tell you what to do long before your head has figured it out."
        ),
        Quote(
            "Pema Chodron",
            "It isn't what happens to us that causes us to suffer; it's what we say to ourselves about what happens."
        ),
        Quote(
            "Edgar Allan Poe",
            "Those who dream by day are cognizant of many things which escape those who dream only by night."
        ),
        Quote(
            "Ben Sweetland",
            "We cannot hold a torch to light another's path without brightening our own."
        ),
        Quote(
            "Richard Bach",
            "You are never given a wish without also being given the power to make it come true. You may have to work for it, however."
        ),
        Quote(
            "Mother Teresa",
            "Kind words can be short and easy to speak, but their echoes are truly endless."
        ),
        Quote(
            "nan",
            "Count your joys instead of your woes. Count your friends instead of your foes."
        ),
        Quote(
            "John Updike",
            "Dreams come true. Without that possibility, nature would not incite us to have them."
        ),
        Quote(
            "Byron Pulsifer",
            "Staying in one place is the best path to be taken over and surpassed by many."
        ),
        Quote(
            "Carl Sagan",
            "Imagination will often carry us to worlds that never were. But without it we go nowhere."
        ),
        Quote(
            "Helen Keller",
            "When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us."
        ),
        Quote(
            "Jawaharlal Nehru",
            "A leader or a man of action in a crisis almost always acts subconsciously and then thinks of the reasons for his action."
        ),
        Quote(
            "Albert Einstein",
            "I have no special talent. I am only passionately curious."
        ),
        Quote(
            "Elizabeth Montagu",
            "I endeavour to be wise when I cannot be merry, easy when I cannot be glad, content with what cannot be mended and patient when there is no redress."
        ),
        Quote(
            "William Scolavino",
            "The height of your accomplishments will equal the depth of your convictions."
        ),
        Quote(
            "Rabbi Hillel",
            "If I am not for myself, who will be for me? If I am not for others, what am I? And if not now, when?"
        ),
        Quote(
            "Audre Lorde",
            "When I dare to be powerful, to use my strength in the service of my vision, then it becomes less and less important whether I am afraid."
        ),
        Quote(
            "Alexis Carrel",
            "All great men are gifted with intuition. They know without reasoning or analysis, what they need to know."
        ),
        Quote(
            "Mark Twain",
            "To get the full value of joy you must have someone to divide it with."
        ),
        Quote(
            "Johann Wolfgang von Goethe",
            "Sometimes our fate resembles a fruit tree in winter. Who would think that those branches would turn green again and blossom, but we hope it, we know it."
        ),
        Quote(
            "Leo Tolstoy",
            "We lost because we told ourselves we lost."
        ),
        Quote(
            "James Pence",
            "Success is determined by those whom prove the impossible, possible."
        ),
        Quote(
            "Agatha Christie",
            "Good advice is always certain to be ignored, but that's no reason not to give it."
        ),
        Quote(
            "Dale Earnhardt",
            "The winner ain't the one with the fastest car it's the one who refuses to lose."
        ),
        Quote(
            "Robert C. Solomon",
            "Spirituality can be severed from both vicious sectarianism and thoughtless banalities. Spirituality, I have come to see, is nothing less than the thoughtful love of life."
        ),
        Quote(
            "Sam Rayburn",
            "No one has a finer command of language than the person who keeps his mouth shut."
        ),
        Quote(
            "Denis Waitley",
            "The only person who never makes mistakes is the person who never does anything."
        ),
        Quote(
            "John Lennon",
            "Life is what happens to you while you're busy making other plans."
        ),
        Quote(
            "Jonathan Swift",
            "Discovery consists of seeing what everybody has seen and thinking what nobody else has thought."
        ),
        Quote(
            "Margaret Fuller",
            "If you have knowledge, let others light their candles in it."
        ),
        Quote(
            "Epictetus",
            "It is impossible for a man to learn what he thinks he already knows."
        ),
        Quote(
            "Will Rogers",
            "If you find yourself in a hole, the first thing to do is stop digging."
        ),
        Quote(
            "Plutarch",
            "To make no mistakes is not in the power of man; but from their errors and mistakes the wise and good learn wisdom for the future."
        ),
        Quote(
            "Lee Womack",
            "I think you can have moderate success by copying something else, but if you really want to knock it out of the park, you have to do something different and take chances."
        ),
        Quote(
            "Marcus Aurelius",
            "Everything we hear is an opinion, not a fact. Everything we see is a perspective, not the truth."
        ),
        Quote(
            "William Menninger",
            "Six essential qualities that are the key to success: Sincerity, personal integrity, humility, courtesy, wisdom, charity."
        ),
        Quote(
            "Lucille Ball",
            "I have an everyday religion that works for me. Love yourself first, and everything else falls into line."
        ),
        Quote(
            "Chuang Tzu",
            "Flow with whatever is happening and let your mind be free. Stay centred by accepting whatever you are doing. This is the ultimate."
        ),
        Quote(
            "Jane Addams",
            "Nothing could be worse than the fear that one had given up too soon, and left one unexpended effort that might have saved the world."
        ),
        Quote(
            "Aristotle",
            "The energy of the mind is the essence of life."
        ),
        Quote(
            "Horace",
            "Begin, be bold, and venture to be wise."
        ),
        Quote(
            "Lao Tzu",
            "Give a man a fish and you feed him for a day. Teach him how to fish and you feed him for a lifetime."
        ),
        Quote(
            "Francis Bacon",
            "A wise man will make more opportunities than he finds."
        ),
        Quote(
            "Eddie Cantor",
            "Slow down and enjoy life. It's not only the scenery you miss by going too fast, you also miss the sense of where you are going and why."
        ),
        Quote(
            "Wayne Dyer",
            "Miracles come in moments. Be ready and willing."
        ),
        Quote(
            "Sophocles",
            "Numberless are the worlds wonders, but none more wonderful than man."
        ),
        Quote(
            "Ralph Emerson",
            "So is cheerfulness, or a good temper, the more it is spent, the more remains."
        ),
        Quote(
            "Francoise de Motteville",
            "The true way to render ourselves happy is to love our work and find in it our pleasure."
        ),
        Quote(
            "Wayne Dyer",
            "When you judge another, you do not define them, you define yourself."
        ),
        Quote(
            "Richard Bach",
            "Argue for your limitations, and sure enough they're yours."
        ),
        Quote(
            "Confucius",
            "He who wishes to secure the good of others, has already secured his own."
        ),
        Quote(
            "Plato",
            "Wise men talk because they have something to say; fools, because they have to say something."
        ),
        Quote(
            "Confucius",
            "Life is really simple, but we insist on making it complicated."
        ),
        Quote(
            "Jim Bishop",
            "The future is an opaque mirror. Anyone who tries to look into it sees nothing but the dim outlines of an old and worried face."
        ),
        Quote(
            "Carl Jung",
            "Everything that irritates us about others can lead us to a better understanding of ourselves."
        ),
        Quote(
            "nan",
            "Beware of the half truth. You may have gotten hold of the wrong half."
        ),
        Quote(
            "Elbert Hubbard",
            "The greatest mistake you can make in life is to be continually fearing you will make one."
        ),
        Quote(
            "Calvin Coolidge",
            "I have never been hurt by anything I didn't say."
        ),
        Quote(
            "Thomas Kempis",
            "Be not angry that you cannot make others as you wish them to be, since you cannot make yourself as you wish to be."
        ),
        Quote(
            "William Ward",
            "Adversity causes some men to break, others to break records."
        ),
        Quote(
            "Thomas Fuller",
            "An invincible determination can accomplish almost anything and in this lies the great distinction between great men and little men."
        ),
        Quote(
            "Abernathy",
            "The industrial landscape is already littered with remains of once successful companies that could not adapt their strategic vision to altered conditions of competition."
        ),
        Quote(
            "Christian Bovee",
            "Example has more followers than reason."
        ),
        Quote(
            "Epictetus",
            "One that desires to excel should endeavour in those things that are in themselves most excellent."
        ),
        Quote(
            "Mary Pickford",
            "If you have made mistakes, there is always another chance for you. You may have a fresh start any moment you choose."
        ),
        Quote(
            "Robert Pirsig",
            "The only Zen you find on the tops of mountains is the Zen you bring up there."
        ),
        Quote(
            "Doris Day",
            "Gratitude is riches. Complaint is poverty."
        ),
        Quote(
            "Richard Needham",
            "Strong people make as many mistakes as weak people. Difference is that strong people admit their mistakes, laugh at them, learn from them. That is how they become strong."
        ),
        Quote(
            "Byron Pulsifer",
            "To know your purpose is to live a life of direction, and in that direction is found peace and tranquillity."
        ),
        Quote(
            "Harriet Woods",
            "You can stand tall without standing on someone. You can be a victor without having victims."
        ),
        Quote(
            "Ralph Emerson",
            "Bad times have a scientific value. These are occasions a good learner would not miss."
        ),
        Quote(
            "nan",
            "It's not who you are that holds you back, it's who you think you're not."
        ),
        Quote(
            "Pablo Picasso",
            "All children are artists. The problem is how to remain an artist once he grows up."
        ),
        Quote(
            "Philip Sidney",
            "Either I will find a way, or I will make one."
        ),
        Quote(
            "Lao Tzu",
            "He who knows that enough is enough will always have enough."
        ),
        Quote(
            "Ralph Emerson",
            "The only way to have a friend is to be one."
        ),
        Quote(
            "Anne Bradstreet",
            "If we had no winter, the spring would not be so pleasant; if we did not sometimes taste of adversity, prosperity would not be so welcome."
        ),
        Quote(
            "Marianne Williamson",
            "Joy is what happens to us when we allow ourselves to recognize how good things really are."
        ),
        Quote(
            "Carl Jung",
            "Your vision will become clear only when you can look into your own heart. Who looks outside, dreams; who looks inside, awakes."
        ),
        Quote(
            "Brian Tracy",
            "There is never enough time to do everything, but there is always enough time to do the most important thing."
        ),
        Quote(
            "Marian Edelman",
            "You really can change the world if you care enough."
        ),
        Quote(
            "Buddha",
            "What you are is what you have been. What you'll be is what you do now."
        ),
        Quote(
            "Gordon Hinckley",
            "Our lives are the only meaningful expression of what we believe and in Whom we believe. And the only real wealth, for any of us, lies in our faith."
        ),
        Quote(
            "Benjamin Haydon",
            "There surely is in human nature an inherent propensity to extract all the good out of all the evil."
        ),
        Quote(
            "Lao Tzu",
            "Music in the soul can be heard by the universe."
        ),
        Quote(
            "John Lubbock",
            "What we see depends mainly on what we look for."
        ),
        Quote(
            "Bruce Lee",
            "To hell with circumstances; I create opportunities."
        ),
        Quote(
            "Ella Wilcox",
            "The truest greatness lies in being kind, the truest wisdom in a happy mind."
        ),
        Quote(
            "John Junor",
            "An ounce of emotion is equal to a ton of facts."
        ),
        Quote(
            "Barbara De Angelis",
            "We need to find the courage to say NO to the things and people that are not serving us if we want to rediscover ourselves and live our lives with authenticity."
        ),
        Quote(
            "Lazurus Long",
            "Great is the art of beginning, but greater is the art of ending."
        ),
        Quote(
            "Wayne Dyer",
            "Simply put, you believer that things or people make you unhappy, but this is not accurate. You make yourself unhappy."
        ),
        Quote(
            "Maya Angelou",
            "Nothing will work unless you do."
        ),
        Quote(
            "Catherine Pulsifer",
            "Our ability to achieve happiness and success depends on the strength of our wings."
        ),
        Quote(
            "Theodore H. White",
            "To go against the dominant thinking of your friends, of most of the people you see every day, is perhaps the most difficult act of heroism you can perform."
        ),
        Quote(
            "Melody Beattie",
            "Gratitude makes sense of our past, brings peace for today, and creates a vision for tomorrow."
        ),
        Quote(
            "Byron Pulsifer",
            "Into each life rain must fall but rain can be the giver of life and it is all in your attitude that makes rain produce sunshine."
        ),
        Quote(
            "Harold Nicolson",
            "We are all inclined to judge ourselves by our ideals; others, by their acts."
        ),
        Quote(
            "Rodin",
            "Nothing is a waste of time if you use the experience wisely."
        ),
        Quote(
            "Aristotle",
            "If one way be better than another, that you may be sure is natures way."
        ),
        Quote(
            "Napoleon Hill",
            "Here is one quality that one must possess to win, and that is definiteness of purpose, the knowledge of what one wants, and a burning desire to possess it."
        ),
        Quote(
            "William Shakespeare",
            "It is not in the stars to hold our destiny but in ourselves."
        ),
        Quote(
            "Tony Robbins",
            "Using the power of decision gives you the capacity to get past any excuse to change any and every part of your life in an instant."
        ),
        Quote(
            "Abraham Lincoln",
            "I will prepare and some day my chance will come."
        ),
        Quote(
            "Tom Jackson",
            "Sometimes the cards we are dealt are not always fair. However you must keep smiling and moving on."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "Strength does not come from winning. Your struggles develop your strengths. When you go through hardships and decide not to surrender, that is strength."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "For me life is continuously being hungry. The meaning of life is not simply to exist, to survive, but to move ahead, to go up, to achieve, to conquer."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "I saw a woman wearing a sweatshirt with Guess on it. I said, Thyroid problem?"
        ),
        Quote(
            "Arnold Schwarzenegger",
            "Bodybuilding is much like any other sport. To be successful, you must dedicate yourself 100% to your training, diet and mental approach."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "It's simple, if it jiggles, it's fat."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "The resistance that you fight physically in the gym and the resistance that you fight in life can only build a strong character."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "The mind is the limit. As long as the mind can envision the fact that you can do something, you can do it, as long as you really believe 100 percent."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "The last three or four reps is what makes the muscle grow. This area of pain divides the champion from someone else who is not a champion. That's what most people lack, having the guts to go on and just say they'll go through the pain no matter what happens."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "Help others and give something back. I guarantee you will discover that while public service improves the lives and the world around you, its greatest reward is the enrichment and new meaning it will bring your own life."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "What we face may look insurmountable. But I learned something from all those years of training and competing. I learned something from all those sets and reps when I didn't think I could lift another ounce of weight. What I learned is that we are always stronger than we know."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "The future is green energy, sustainability, renewable energy."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "The worst thing I can be is the same as everybody else. I hate that."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "Failure is not an option. Everyone has to succeed."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "Start wide, expand further, and never look back."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "Training gives us an outlet for suppressed energies created by stress and thus tones the spirit just as exercise conditions the body."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "My body is like breakfast, lunch, and dinner. I don't think about it, I just have it."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "I welcome and seek your ideas, but do not bring me small ideas; bring me big ideas to match our future."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "As long as I live, I will never forget that day 21 years ago when I raised my hand and took the oath of citizenship. Do you know how proud I was? I was so proud that I walked around with an American flag around my shoulders all day long."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "I just use my muscles as a conversation piece, like someone walking a cheetah down 42nd Street."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "As you know, I'm an immigrant. I came over here as an immigrant, and what gave me the opportunities, what made me to be here today, is the open arms of Americans. I have been received. I have been adopted by America."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "In our society, the women who break down barriers are those who ignore limits."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "Learned helplessness is the giving-up reaction, the quitting response that follows from the belief that whatever you do doesn't matter."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "My own dreams fortunately came true in this great state. I became Mr. Universe; I became a successful businessman. And even though some people say I still speak with a slight accent, I have reached the top of the acting profession."
        ),
        Quote(
            "Arnold Schwarzenegger",
            "If it's hard to remember, it'll be difficult to forget."
        )
    )
}