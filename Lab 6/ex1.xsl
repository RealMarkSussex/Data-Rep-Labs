<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<head>
				<title>
						Courses
					</title>
			</head>
			<body>
				<xsl:for-each select="/Course_Catalog/Department">
					<p>
						<xsl:value-of select="Title" />
					</p>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>
	<!--..... Add the templates -->
</xsl:stylesheet>
